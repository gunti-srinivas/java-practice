
class printNumber implements Runnable {

    int value;
     
    printNumber(int value){
        this.value = value;
    }
    public void run(){
         System.out.println("MY value "+ this.value+"  HI I am running on the "+ Thread.currentThread().getName());
    }
    
}
