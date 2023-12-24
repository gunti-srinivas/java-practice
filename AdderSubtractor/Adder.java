import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    public Value val;

    public Lock lock;
    public Adder(Value val, Lock lock){

        this.val = val;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 100; i++){
//            requesting if i can get the key to this lock. Lock class will only give the key if no one else already has a key
            System.out.println("Adder requesting for lock "+ i);
            lock.lock();
            this.val.counter = this.val.counter+i;
            lock.unlock();
            System.out.println("Adder "+ i);
        }
        return null;
    }
}
