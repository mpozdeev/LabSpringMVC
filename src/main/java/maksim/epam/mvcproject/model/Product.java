package maksim.epam.mvcproject.model;

import java.util.Objects;

public class Product {

    private Long id;
    private String nameProduct;
    private String description;
    private float cost;

    public Product(){}

    public Product(Long id, String nameProduct, String description, float cost) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.description = description;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id) &&
                nameProduct.equals(product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameProduct);
    }
}
