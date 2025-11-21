/*
 * Submission: 1771337499
 * Problem: Print FooBar Alternately (Medium)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-09-15 08:01:38 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class FooBar {
    private int n;
    private int c = 0;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while (c%2 == 1);
        	// printFoo.run() outputs "foo". Do not change or remove this line.
            // b = false;
        	printFoo.run();
            // b = true;
            c++;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while (c%2 == 0);
            // while(!b);
            // f = false;
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            // f = true;
            c++;
        }
    }
}