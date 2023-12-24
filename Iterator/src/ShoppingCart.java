import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements  Iterable<Product>{

    private List<Product> list;

    public ShoppingCart(){
        this.list = new ArrayList<Product>();

    }


    public void addProduct(Product product){
        list.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return new ProductsIterator(list);
    }
}
