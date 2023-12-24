import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    
   
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        System.out.println("hello world   I am running on "+ Thread.currentThread().getName());
        for(int i = 0; i < 8; i++){
           executorService.execute(new printNumber(i));
           
        }
    }
    
}
