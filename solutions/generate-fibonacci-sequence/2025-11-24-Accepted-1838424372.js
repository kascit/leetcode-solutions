/*
Submission: 1838424372
Status: Accepted
Timestamp: 2025-11-24 10:32:20 UTC
Runtime: 47 ms
Memory: 53.8 MB
*/

/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let a = 0, b = 1;
    while(true){
        yield a;
        let t = a;
        a = b
        b += t
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */