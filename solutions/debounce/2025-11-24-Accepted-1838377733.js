/*
Submission: 1838377733
Status: Accepted
Timestamp: 2025-11-24 09:20:05 UTC
Runtime: 54 ms
Memory: 55.8 MB
*/

/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let tr = null
    return function(...args) {
        if (tr) clearTimeout(tr)
        tr = setTimeout(()=>fn(...args),t)
    }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */