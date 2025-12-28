/*
 * Submission: 1765030838
 * Problem: Coupon Code Validator (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-09 14:48:39 UTC
 * Runtime: 8 ms
 * Memory: 45.6 MB
 */

import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] codes, String[] businessLines, boolean[] isActive) {
        List<Integer> validIdx = new ArrayList<>();
        Set<String> allowed = Set.of("electronics", "grocery", "pharmacy", "restaurant");

        for (int i = 0; i < codes.length; i++) {
            if (isActive[i]
                && allowed.contains(businessLines[i])
                && isValidCode(codes[i])) {
                validIdx.add(i);
            }
        }

        validIdx.sort((i, j) -> {
            int cmp = businessLines[i].compareTo(businessLines[j]);
            return (cmp != 0) ? cmp : codes[i].compareTo(codes[j]);
        });

        List<String> result = new ArrayList<>();
        for (int idx : validIdx) result.add(codes[idx]);
        return result;
    }

    private boolean isValidCode(String code) {
        if (code == null || code.isEmpty()) return false;
        for (char ch : code.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') return false;
        }
        return true;
    }
}
