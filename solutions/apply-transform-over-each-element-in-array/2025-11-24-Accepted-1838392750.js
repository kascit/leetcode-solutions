/*
Submission: 1838392750
Status: Accepted
Timestamp: 2025-11-24 09:42:49 UTC
Runtime: 47 ms
Memory: 54.6 MB
*/

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const ans = []
    arr.forEach((v,i)=>{ans.push(fn(v,i))})
    return ans
};