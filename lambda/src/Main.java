import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
       System.out.println( decider("upper").apply("Srinivas"));
    }

    public  static Function decider(String input){

        if(input.equals("lower")){
            Function<String, String> printLower = Main::printLower;
           return printLower;
        }
        else if(input.equals("upper")){
            Function<String, String> printUpper = Main::printUpper;
            return printUpper;
        }
        else{
            Function<String, String> printNormal = Main::printNormal;
            return printNormal;
        }
    }

    public static String printUpper(String text){
        return text.toUpperCase();
    }

    public static String printLower(String text){
        return text.toLowerCase();
    }

    public static  String printNormal(String text){
        return text;
    }
}