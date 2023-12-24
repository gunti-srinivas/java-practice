package multiThreadedSingleTon;

public class DataBaseConnectionMulti {

    private static DataBaseConnectionMulti dataBaseConnectionMulti;


    private DataBaseConnectionMulti(){}


    public static DataBaseConnectionMulti getInstance(){
        if(dataBaseConnectionMulti == null){
            synchronized (DataBaseConnectionMulti.class){
                if(dataBaseConnectionMulti == null){
                    dataBaseConnectionMulti = new DataBaseConnectionMulti();
                }
            }
        }
        return dataBaseConnectionMulti;
    }
}
