public class Value {
    private static int num;


    public Value(int num){

        this.num = num;
    }

    public  int getNum() {
        return num;
    }

//    public  void setNum(int num) {
//        this.num = num;
//    }

    public static synchronized  void increment(int value){

        Value.num += value;
    }
}
