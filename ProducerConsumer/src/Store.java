import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    Queue<Object> items;
    public Store(){
        items = new ConcurrentLinkedQueue<>();
    }

    public void addItem(int id){
        items.add(new Object());

        System.out.println("producer semaphore with id  : " + id +"  Items added size is :" + items.size());
    }

    public void removeItem(int id){
        items.remove(items.remove());
        System.out.println("consumer semaphore with id :" + id +"  Items removed size is :"+ items.size());

    }
}
