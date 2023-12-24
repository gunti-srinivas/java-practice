import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;

    private Semaphore producerSemaphore;

    private Semaphore consumerSemaphore;

    private int id;

    public Consumer(Store store,Semaphore producerSemaphore,Semaphore consumerSemaphore, int id){
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
        this.id = id;
    }
    public void consume(){
        try {
            consumerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.removeItem(id);
        producerSemaphore.release();
    }
    @Override
    public void run() {
        while(true){
            consume();
        }
    }
}
