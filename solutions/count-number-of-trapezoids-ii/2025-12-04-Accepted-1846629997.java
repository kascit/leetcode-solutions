/*
Submission: 1846629997
Status: Accepted
Timestamp: 2025-12-04 08:57:36 UTC
Runtime: 409 ms
Memory: 286.1 MB
*/

// FUCK AI
class Solution {
    // Helper to reduce fractions
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int countTrapezoids(int[][] points) {
        int n = points.length;
        if (n < 4) {
            // DEBUG: Not enough points to form a trapezoid
            // System.out.println("DEBUG: Insufficient points (N < 4). Returning 0.");
            return 0;
        }

        // Map: Slope String -> (Intercept -> List of Lengths on that specific line)
        Map<String, Map<Long, List<Long>>> slopes = new HashMap<>();

        // DEBUG: PHASE 1: Segment & Grouping Analysis
        // System.out.println("--- DEBUG PHASE 1: Segment Analysis & Grouping ---");
        int segmentCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];
                
                int dx = x2 - x1;
                int dy = y2 - y1;

                if (dx == 0 && dy == 0) continue; // Skip duplicate points

                segmentCount++;
                
                // 1. Calculate Length Squared (Used for Parallelogram Check)
                long lenSq = (long)dx * dx + (long)dy * dy;

                // 2. Normalize Orientation (Consistent direction for keying)
                // Ensures dx >= 0, or if vertical, dy >= 0
                if (dx < 0 || (dx == 0 && dy < 0)) {
                    dx = -dx;
                    dy = -dy;
                }

                // 3. Compute Reduced Slope (Key for Parallelism)
                int g = gcd(Math.abs(dy), Math.abs(dx));
                int sDx = dx / g; // Reduced dx
                int sDy = dy / g; // Reduced dy
                String slopeKey = sDx + "," + sDy;

                // 4. Compute Intercept (Key for Unique Line)
                // Equation: dy*x - dx*y = C. Use RAW dx, dy for intercept calc here 
                // to maintain proportionality before reduction.
                // NOTE: Use original coordinates (x1, y1) but REDUCED slope (sDx, sDy)
                // to calculate the intercept C for the standard line equation.
                long intercept = (long)sDy * x1 - (long)sDx * y1;

                // DEBUG: Print details for every segment
                // System.out.printf("SEGMENT %d: (%d,%d)-(%d,%d) | Slope: %s | Intercept: %d | LenSq: %d\n",
                                  // segmentCount, x1, y1, x2, y2, slopeKey, intercept, lenSq);
                
                // Store in nested map
                slopes.computeIfAbsent(slopeKey, k -> new HashMap<>())
                      .computeIfAbsent(intercept, k -> new ArrayList<>())
                      .add(lenSq);
            }
        }
        // System.out.printf("\nTOTAL SEGMENTS PROCESSED: %d\n", segmentCount);
        // System.out.printf("TOTAL UNIQUE SLOPES FOUND: %d\n", slopes.size());
        // System.out.println("-------------------------------------------------");


        // --- DEBUG PHASE 2: Calculation ---
        // System.out.println("--- DEBUG PHASE 2: Calculation & Final Count ---");
        long ans = 0;   // Counts all parallel pairs (Trapezoids + 2*Parallelograms)
        long para = 0;  // Counts equal-length parallel pairs (2*Parallelograms)
        int slopeIdx = 0;

        // Iterate over each Slope Group
        for (var entry : slopes.entrySet()) {
            String slopeKey = entry.getKey();
            Map<Long, List<Long>> linesMap = entry.getValue();
            slopeIdx++;

            // System.out.printf("\n[%d] SLOPE: %s | DISTINCT LINES: %d\n", slopeIdx, slopeKey, linesMap.size());

            // If only 1 line, no trapezoids are possible from this slope.
            if (linesMap.size() < 2) {
                // System.out.println("DEBUG: Only 1 line found for this slope. Skipping.");
                continue;
            }

            // Stats for segments seen so far on PREVIOUS lines for this slope
            long segmentsSoFar = 0;
            Map<Long, Integer> lengthsSoFar = new HashMap<>(); // Freq map of lengths from previous lines

            int lineIdx = 0;
            // Iterate over each distinct line (Intercept)
            for (var lineEntry : linesMap.entrySet()) {
                lineIdx++;
                long intercept = lineEntry.getKey();
                List<Long> currentLengths = lineEntry.getValue();
                int currentCount = currentLengths.size();

                // A. Update ANS (Trapezoids)
                // Pairs = Segments on current line * Segments on all previous lines
                long newAnsPairs = segmentsSoFar * currentCount;
                ans += newAnsPairs;

                // B. Update PARA (Parallelogram Candidates)
                long newParaPairs = 0;
                for (long len : currentLengths) {
                    newParaPairs += lengthsSoFar.getOrDefault(len, 0);
                }
                para += newParaPairs;
                
                // System.out.printf("  Line %d (Int: %d): Segments: %d | ANS pairs added: %d | PARA pairs added: %d\n",
                                  // lineIdx, intercept, currentCount, newAnsPairs, newParaPairs);
                
                // Update History for the next line
                segmentsSoFar += currentCount;
                for (long len : currentLengths) {
                    lengthsSoFar.merge(len, 1, Integer::sum);
                }
            }
            // System.out.printf("  Slope %s Totals: ANS=%d, PARA=%d\n", slopeKey, ans, para);
        }

        // Final Result Calculation
        long finalResult = ans - (para / 2);
        
        // System.out.println("\n---------------- FINAL RESULT -------------------");
        // System.out.printf("Total Parallel Pairs (ANS): %d\n", ans);
        // System.out.printf("Total Equal-Length Parallel Pairs (PARA): %d\n", para);
        // System.out.printf("Result Formula: ANS - (PARA / 2) = %d - (%d / 2) = %d\n", ans, para, finalResult);
        // System.out.println("-------------------------------------------------");
        
        return (int) finalResult;
    }
}