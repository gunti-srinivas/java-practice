import java.util.Iterator;
import java.util.List;

public class ProductsIterator implements Iterator<Product>{

    private List<Product> productList;
    int cursor = 0;
    public ProductsIterator(List<Product> productList){
        this.productList = productList;
    }
    @Override
    public boolean hasNext() {
       return cursor < productList.size();
    }

    @Override
    public Product next() {
        Product item = productList.get(cursor);
        cursor++;
        return  item;
    }
}
