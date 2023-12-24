import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    public  Value counter;

    public Adder(Value counter){
        this.counter = counter;

    }


    @Override
    public Void call() throws Exception {

        for(int i = 1; i <= 100; i++){
//            requesting for the lock , If the lock is not with any one it gives lock, orelse have to wait for the lock
            System.out.println("Adder class requesting for the lock "+ i);
//            sync block
            synchronized (counter){
                this.counter.num +=1;
                System.out.println("Added "+i);
            }

        }
        return null;
    }
}
