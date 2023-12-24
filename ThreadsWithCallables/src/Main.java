import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayCreator arrayCreator = new ArrayCreator(n);
        Future<List<Integer>> arrayListFuture = executorService.submit(arrayCreator);

        List<Integer> arrayList = arrayListFuture.get();

        for(Integer i : arrayList){
            System.out.println(i);
        }

    }
}