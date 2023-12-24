import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("phone"));
        shoppingCart.addProduct(new Product("samsung"));
        shoppingCart.addProduct(new Product("apple"));
        shoppingCart.addProduct(new Product("mango"));

        Iterator<Product> iterator = shoppingCart.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}