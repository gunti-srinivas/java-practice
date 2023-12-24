import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws Exception {

        Value commonRef = new Value(0);

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(commonRef, lock);
        Subtractor subtractor = new Subtractor(commonRef, lock);

        ExecutorService ex = Executors.newCachedThreadPool();

        Future<Void> adderFuture = ex.submit(adder);
        Future<Void> subtractorFuture = ex.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(commonRef.counter);
        ex.shutdown();
    }
}
