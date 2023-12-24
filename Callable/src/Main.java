
import org.omg.CORBA.Object;

import java.lang.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String args[]) throws ExecutionException, InterruptedException {


        ExecutorService ex = Executors.newFixedThreadPool(1);
        Call obj = new Call();
        Future<Integer> submit = ex.submit(obj);
        System.out.println(submit.get());
    }

}