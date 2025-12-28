/*
Submission: 1838397241
Status: Accepted
Timestamp: 2025-11-24 09:50:05 UTC
Runtime: 50 ms
Memory: 54.9 MB
*/

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    return arr.reduce((out, val, i) => {
        if (fn(val, i)) out.push(val);
        return out;
    }, []);
};