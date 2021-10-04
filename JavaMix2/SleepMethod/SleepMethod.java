// sleep method is pass running state to non runnable(blocking state)

class TestSleepMethod extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500); /// 500 miliseconds
        }
    }

    public static void main(String args[]) {
        TestSleepMethod t1 = new TestSleepMethod();
        TestSleepMethod t2 = new TestSleepMethod();

        t1.start();
        t2.start(); // output should be 1 1 2 2 3 3 4 4
    }
}