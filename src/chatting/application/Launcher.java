package chatting.application;

public class Launcher {
    public static void main(String[] args) {
        Thread server = new Thread(() -> Server.main(args));
        Thread client = new Thread(() -> Client.main(args));

        server.start();
        client.start();

        try {
            server.join();
            client.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // After both classes have finished their execution, you can continue with any further logic here
        System.out.println("Both classes have finished executing.");
    }
}
