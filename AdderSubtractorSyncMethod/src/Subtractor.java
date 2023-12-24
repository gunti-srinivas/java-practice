import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    public Value counter;



    public Subtractor(Value counter){
        this.counter = counter;

    }

    @Override
    public  Void call() throws Exception {
        for(int i = 1; i <= 10000; i++){

            System.out.println("subtractor class requesting for the lock "+ i);
            counter.increment(-i);
            System.out.println("subtracted "+ i);
        }
        return null;
    }
}
