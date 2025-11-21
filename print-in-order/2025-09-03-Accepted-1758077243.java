/*
 * Submission: 1758077243
 * Problem: Print in Order (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:12:55 UTC
 * Runtime: 10 ms
 * Memory: 42.4 MB
 */

class Foo {
    volatile boolean one, two;
    public Foo() {
        one = false;
        two = false;
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        one = true;

    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        while(!one);
        printSecond.run();
        two = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        while(!one || !two);
        printThird.run();
    }
}