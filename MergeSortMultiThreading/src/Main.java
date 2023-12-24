import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayToSort = new ArrayList<Integer>(Arrays.asList(8, 2, 4, 1, 9, 6, 0, 7));
        ExecutorService ex = Executors.newCachedThreadPool();
        System.out.println("Hello world!");
    }
}