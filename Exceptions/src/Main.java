import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        String path = "F:\\practice java\\Exceptions\\src\\test.txt";
        readFile(path);
    }

    public static void readFile(String path)  {
        System.out.println("started file reading");
        try {
            String val = null;
            File file = new File(val);
            FileReader fileReader = new FileReader(file);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        System.out.println("file read done");
    }
}