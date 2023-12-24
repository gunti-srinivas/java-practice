import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value counter = new Value(0);
        Lock  lock = new ReentrantLock();
        ExecutorService ex = Executors.newCachedThreadPool();
        Adder adder = new Adder(counter, lock);
        Subtractor subtract = new Subtractor(counter, lock);
        Future<Void> adderFuture = ex.submit(adder);
        Future<Void> subtractFuture = ex.submit(subtract);

        adderFuture.get();
        subtractFuture.get();
        ex.shutdown();
    }
}