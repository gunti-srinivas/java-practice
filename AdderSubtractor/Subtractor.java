import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;


public class Subtractor implements Callable<Void> {

    public Value val;

    public Lock lock;
    public Subtractor(Value val, Lock lock){

        this.val = val;

        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 100; i++){


            this.val.counter -= i;
            lock.unlock();

        }
        return null;
    }


}
