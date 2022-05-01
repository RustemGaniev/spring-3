import java.util.concurrent.Executors;



public class Server {

    public static void startServer() {

        int poolsNumber = 64;

        final MyRunnable myRunnable = new MyRunnable();

        Executors.newFixedThreadPool(poolsNumber).execute(myRunnable);

    }

}
