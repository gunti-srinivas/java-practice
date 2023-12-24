import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value counter = new Value(0);
        HashMap
        ExecutorService ex = Executors.newCachedThreadPool();
        Adder adder = new Adder(counter);
        Subtractor subtract = new Subtractor(counter);
        Future<Void> adderFuture = ex.submit(adder);
        Future<Void> subtractFuture = ex.submit(subtract);

        adderFuture.get();
        subtractFuture.get();
        System.out.println("final result ---> "+ counter.getNum());
        ex.shutdown();
    }
}