/*
 * Submission: 1710727554
 * Problem: Return Length of Arguments Passed (Easy)
 * Status: Accepted
 * Language: javascript
 * Timestamp: 2025-07-25 08:31:14 UTC
 * Runtime: 40 ms
 * Memory: 53.9 MB
 */

/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
  return args.length;  
};

/**
 * argumentsLength(1, 2, 3); // 3
 */