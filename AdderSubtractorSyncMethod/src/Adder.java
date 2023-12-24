import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    public  Value counter;

    public Adder(Value counter){
        this.counter = counter;

    }


    @Override
    public  Void call() throws Exception {

        for(int i = 1; i <= 10000; i++){
            System.out.println("Adder class requesting for the lock "+ i);
            counter.increment(i);
            System.out.println("Added "+i);
        }
        return null;
    }
}
