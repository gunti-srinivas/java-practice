import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Store store;

    private Semaphore producerSemaphore;

    private Semaphore consumerSemaphore;

    private int id;
    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore, int id){
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.id = id;
    }
    public void produce(){
        try {
            producerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.addItem(id);
        consumerSemaphore.release();
    }
    @Override
    public void run() {
        while(true){
            produce();
        }
    }
}
