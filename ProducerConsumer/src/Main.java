import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        Semaphore producerSemaphore = new Semaphore(5);

        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService ex = Executors.newCachedThreadPool();

        for(int i = 1; i <= 20; i++){
            ex.execute(new Producer(store, producerSemaphore, consumerSemaphore, i));
        }

        for(int i = 1; i <= 20; i++){
            ex.execute(new Consumer(store, producerSemaphore, consumerSemaphore, i));
            ex.acc
        }
    }
}