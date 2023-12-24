

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;


public class ArrayCreator implements Callable<List<Integer>>{

    public int size;
    List<Integer> arrayList;

    public ArrayCreator(int n){
        this.size = n;
        arrayList = new ArrayList<>();
    }

    public List<Integer> call() throws Exception{

        for(int i = 1; i <= size; i++){
            arrayList.add(i);
        }
        return arrayList;
    }
}
