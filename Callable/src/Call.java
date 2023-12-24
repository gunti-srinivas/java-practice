import java.util.concurrent.Callable;

public class Call {

    Callable<String> callable = Call::returnStatus;



    public static String returnStatus(){
        System.out.println("calling from callable");
        return "done";

    }

    public static int returnNumber(){
        System.out.println("calling from callable");
        return 1;
    }
}
