/*
Submission: 1842630392
Status: Accepted
Timestamp: 2025-11-29 17:00:30 UTC
Runtime: 35 ms
Memory: 54.2 MB
*/

/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World"
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */