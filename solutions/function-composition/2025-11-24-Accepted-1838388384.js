/*
Submission: 1838388384
Status: Accepted
Timestamp: 2025-11-24 09:35:45 UTC
Runtime: 65 ms
Memory: 56.8 MB
*/

/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {
        for (let i = functions.length - 1; i>= 0; i--) {
            x = functions[i](x)
        }
        return x
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */