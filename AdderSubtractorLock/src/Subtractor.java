import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    public Value counter;

    public Lock lock;

    public Subtractor(Value counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 100; i++){
//            subtractor class requesting for the lock, if the key is present it will give, orelse it has to wait in queue;
            System.out.println("subtractor class requesting for the lock "+ i);
            lock.lock();
            this.counter.num -=1;
            lock.unlock();
            System.out.println("subtracted "+ i);
        }
        return null;
    }
}
