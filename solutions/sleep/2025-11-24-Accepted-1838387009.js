/*
Submission: 1838387009
Status: Accepted
Timestamp: 2025-11-24 09:33:43 UTC
Runtime: 57 ms
Memory: 53.6 MB
*/

/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    return new Promise(resolve => setTimeout(resolve,millis))
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */