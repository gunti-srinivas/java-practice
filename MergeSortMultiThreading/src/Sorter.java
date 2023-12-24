import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService ex;

    public Sorter(List<Integer> list, ExecutorService ex){
        this.arrayToSort = list;
        this.ex = ex;
    }

    @Override
    public List<Integer> call() throws Exception {
            if(arrayToSort.size() <= 1){
                return arrayToSort;
            }

            List<Integer> leftArrayToSort = new ArrayList<>();
            List<Integer> rightArrayToSort = new ArrayList<>();

            int mid = arrayToSort.size()/2;

            for(int i = 0; i < mid; i++){
                leftArrayToSort.add(arrayToSort.get(i));
            }

            for(int i = mid; i < arrayToSort.size(); i++){
                rightArrayToSort.add(arrayToSort.get(i));
            }

            Sorter leftArraySorter = new Sorter(leftArrayToSort, ex);
            Future<List<Integer>>  sortedLeftArrayFuture = ex.submit(leftArraySorter);
            Sorter rightArraySorter = new Sorter(rightArrayToSort, ex);
            Future<List<Integer>> sortedRightArrayFuture = ex.submit(rightArraySorter);

            List<Integer> sortedArray = new ArrayList<>();

            int i = 0;
            int j = 0;

            List<Integer> sortedLeftArray = sortedLeftArrayFuture.get(); // blocking
            List<Integer> sortedRightArray = sortedRightArrayFuture.get();

            while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
                if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                    sortedArray.add(sortedLeftArray.get(i));
                    i++;
                } else {
                    sortedArray.add(sortedRightArray.get(j));
                    j++;
                }
            }

            while (i < sortedLeftArray.size()) {
                sortedArray.add(sortedLeftArray.get(i));
                i++;
            }

            while (j < sortedRightArray.size()) {
                sortedArray.add(sortedRightArray.get(j));
                j++;
            }

            return sortedArray;
    }


}
