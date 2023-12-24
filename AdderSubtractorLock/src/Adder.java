import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    public  Value counter;
    public Lock lock;
    public Adder(Value counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }


    @Override
    public Void call() throws Exception {

        for(int i = 1; i <= 100; i++){
//            requesting for the lock , If the lock is not with any one it gives lock, orelse have to wait for the lock
            System.out.println("Adder requesting for the lock "+ i);
            lock.lock();
            this.counter.num +=1;
//            lock got released
            lock.unlock();
            System.out.println("Added "+i);

        }
        return null;
    }
}
