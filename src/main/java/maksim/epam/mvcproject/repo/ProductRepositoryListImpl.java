package maksim.epam.mvcproject.repo;

import maksim.epam.mvcproject.model.Product;

import java.util.List;

public class ProductRepositoryListImpl implements ProductRepository {

    private long sequence = 0;

    private List<Product> productList;

    public ProductRepositoryListImpl() {
    }

    private Long incSequence() {
        return ++sequence;
    }

    @Override
    public Long addProduct(Product product) {
        Long id = incSequence();
        product.setId(id);
        productList.add(product);
        return id;
    }

    @Override
    public Product getProductByName(String name) {
        for (Product product : productList) {
            if (product.getNameProduct().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void setProducts(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Long updateProduct(Product newProduct) {
        System.err.println("updateProduct - не реализована");
        return -1L;
    }

    @Override
    public Long deleteProduct(Product deleteProduct) {
        Long index = -1L;
        for (Product product : productList) {
            if (product.equals(deleteProduct)) {
                index = product.getId();
                productList.remove(deleteProduct);
            }
        }
        return index;
    }
}
