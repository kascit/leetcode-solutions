/*
Submission: 1851198544
Status: Accepted
Timestamp: 2025-12-09 15:14:25 UTC
Runtime: 2 ms
Memory: 46.9 MB
*/

// AI HELPED WITH IMPRECISE ANS:
/**
Input
equations =
[["b","a"],["c","b"],["d","c"],["e","d"],["f","e"],["g","f"],["h","g"],["i","h"],["j","i"],["k","j"],["k","l"],["l","m"],["m","n"],["n","o"],["o","p"],["p","q"],["q","r"],["r","s"],["s","t"],["t","u"]]
values =
[1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05]
queries =
[["a","u"]]

Output
[0.99994]
Expected
[1.00000]
 */

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        // --- 1. Map Variables to Indices (Your original code is fine here) ---
        Map<String, Integer> mappy = new HashMap<>();
        int idx = 0;
        for (List<String> l : equations) {
            for (String s : l) {
                if (!mappy.containsKey(s)) {
                    mappy.put(s, idx++);
                }
            }
        }
        int n = mappy.size();
        
        // --- 2. Initialize the Log Matrix (mat now stores log(value)) ---
        // We use a large negative number to represent 'unreachable' (since log(value) can be negative)
        // Double.NEGATIVE_INFINITY is a safe choice, but using a sentinel is simpler.
        double[][] mat = new double[n][n];
        double SENTINEL = Double.MAX_VALUE; // Sentinel for 'unreachable'

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = SENTINEL;
            }
        }
        
        // Set diagonal to log(1.0) = 0.0
        for (int i = 0; i < n; i++) {
            mat[i][i] = 0.0;
        }

        // --- 3. Populate Initial Log Weights ---
        for (int i = 0; i < values.length; i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            int ui = mappy.get(u);
            int vi = mappy.get(v);
            double wt = values[i];

            // log(A/B) = log(wt)
            mat[ui][vi] = Math.log(wt); 
            
            // log(B/A) = log(1/wt) = -log(wt)
            mat[vi][ui] = -Math.log(wt);
        }

        // --- 4. Run Floyd-Warshall with Addition ---
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Check if both paths exist (i->k and k->j)
                    if (mat[i][k] != SENTINEL && mat[k][j] != SENTINEL) {
                        // Floyd-Warshall: Path length is MIN(current_path, path_via_k)
                        // Since we are not strictly looking for the "shortest" path here 
                        // (any path is valid if it exists), we use addition only.
                        // We must ensure the path through k is a valid one before updating.
                        
                        double path_via_k = mat[i][k] + mat[k][j];
                        
                        // If current path is Sentinel OR new path is better (less error prone, 
                        // though any path is correct in this problem), update it.
                        // For the specific task, simply updating if k is reachable is sufficient.
                        if (mat[i][j] == SENTINEL || mat[i][j] > path_via_k) {
                             mat[i][j] = path_via_k;
                        }
                    }
                }
            }
        }

        // --- 5. Process Queries and Exponentiate ---
        idx = 0;
        double[] ans = new double[queries.size()];
        for (List<String> q : queries) {
            String start = q.get(0);
            String end = q.get(1);

            // Check if both variables are in the graph
            if (!mappy.containsKey(start) || !mappy.containsKey(end)) {
                ans[idx++] = -1.0;
                continue;
            }
            
            int a = mappy.get(start);
            int b = mappy.get(end);
            
            // Check if path exists
            if (mat[a][b] == SENTINEL) {
                ans[idx++] = -1.0;
            } else {
                // Final Answer = e ^ log(value)
                ans[idx++] = Math.exp(mat[a][b]);
            }
        }
        return ans;
    }
}