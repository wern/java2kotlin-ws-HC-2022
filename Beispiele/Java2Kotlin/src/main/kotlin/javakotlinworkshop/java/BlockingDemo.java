package javakotlinworkshop.java;

public class BlockingDemo {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Nürnberg!");
            } catch (InterruptedException e) { /**/ }
        });
        System.out.print("Hallo ");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) { /**/ }
    }
}
