/*
Submission: 1838420303
Status: Accepted
Timestamp: 2025-11-24 10:25:54 UTC
Runtime: 42 ms
Memory: 55.8 MB
*/

/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const ans = []
    for (let i = 0; i < arr.length; i+=size){
        ans.push(arr.slice(i,i+size))
    } return ans
};
