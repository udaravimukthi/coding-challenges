import jdk.javadoc.internal.doclets.formats.html.resources.standard;

//java threads

//1. By using , extending the java thread class
//2. By using , by implementing runnable interface

//By using extending the java thread class
class Multi extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String args[]) {
        Multi t1 = new Multi();
        t1.start(); // start the theread
    }
}

// By using implementing runnable interface
class Multi2 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String args[]) {
        Multi2 m1 = new Multi2();
        Thread t1 = new Thread(m1);

        t1.start(); // creating a thread, here also output should be Thread is running
    }
}
