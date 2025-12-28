/*
Submission: 1838376502
Status: Accepted
Timestamp: 2025-11-24 09:18:18 UTC
Runtime: 57 ms
Memory: 54.9 MB
*/

/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    const a = await promise1;
    const b = await promise2;
    return a+b
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */