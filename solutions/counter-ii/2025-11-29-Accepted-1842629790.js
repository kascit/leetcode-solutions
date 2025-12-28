/*
Submission: 1842629790
Status: Accepted
Timestamp: 2025-11-29 16:59:35 UTC
Runtime: 53 ms
Memory: 58.5 MB
*/

/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let f = init
    return {
        increment: () => ++f,
        decrement: () => --f,
        reset: () => f = init,
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */