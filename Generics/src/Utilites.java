public class Utilites {

    public <K, V> void  doSomething(K key, V value){
        System.out.println(key);
        System.out.println(value);
    }

    public <K, V> String doSomething1(K key, V value){
        return key.toString()+value.toString();
    }
}
