class MsgPrinter implements Runnable {
    String message;
    int interval;  

    MsgPrinter(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MsgPrinter("BMS College of Engineering", 10000));
        Thread t2 = new Thread(new MsgPrinter("CSE", 2000));

        t1.start();
        t2.start();
    }
}
