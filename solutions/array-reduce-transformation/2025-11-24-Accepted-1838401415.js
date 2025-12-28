/*
Submission: 1838401415
Status: Accepted
Timestamp: 2025-11-24 09:56:26 UTC
Runtime: 44 ms
Memory: 57.1 MB
*/

/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let acc = init;
    nums.forEach((val, i) => {
        acc = fn(acc, val, i);
    });
    return acc;
};
