/*
Submission: 1842627084
Status: Accepted
Timestamp: 2025-11-29 16:55:53 UTC
Runtime: 103 ms
Memory: 72.4 MB
*/

/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    return arr.slice().sort((a,b)=>fn(a)-fn(b))
};