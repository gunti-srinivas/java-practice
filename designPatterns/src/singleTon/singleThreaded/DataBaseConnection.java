package singleTon.singleThreaded;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection;

    private DataBaseConnection(){}


    /**
     * This code works well in single thread, but not work in multi-threaded enviroment.
     * @return dataBaseConnection
     */
    public static DataBaseConnection getInstance(){

        if(dataBaseConnection == null){
            dataBaseConnection = new DataBaseConnection();
            return dataBaseConnection;
        }
        return dataBaseConnection;
    }

}


