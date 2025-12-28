/*
Submission: 1842628271
Status: Accepted
Timestamp: 2025-11-29 16:57:30 UTC
Runtime: 41 ms
Memory: 53.8 MB
*/

/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    
    return function() {
        return n++
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */