import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public void myFunction(){

    }
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.execute(() -> {
            try {
                foo.first(() -> {
                    System.out.println("first()");
                    System.out.println(Thread.currentThread());
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.execute(() -> {
            try {
                foo.second(() -> {System.out.println("second()");
                    System.out.println(Thread.currentThread());});
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.execute(() -> {
            try {
                foo.third(() -> {System.out.println("third()");
                    System.out.println(Thread.currentThread());
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.shutdown();
    }
}