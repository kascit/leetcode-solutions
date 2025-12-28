/*
Submission: 1838389087
Status: Accepted
Timestamp: 2025-11-24 09:36:54 UTC
Runtime: 34 ms
Memory: 54 MB
*/

/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let done = false;
    return function(...args){
        if (done) return undefined
        done = true;
        return fn(...args)
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
