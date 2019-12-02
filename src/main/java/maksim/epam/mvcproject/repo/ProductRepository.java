package maksim.epam.mvcproject.repo;

import maksim.epam.mvcproject.model.Product;

import java.util.List;

public interface ProductRepository {

    Long addProduct(Product product);

    Product getProductByName(String name);

    void setProducts (List<Product> productList);

    Long updateProduct(Product product);

    Long deleteProduct(Product product);

}
