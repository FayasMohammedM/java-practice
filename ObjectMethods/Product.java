package ObjectMethods;

import java.util.Objects;

public class Product {
    String productId;
    String productName;

    public Product(String produtId , String productName){
        this.productId = produtId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product [ ID : "+this.productId+", Name " +this.productName+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj==null) return false;

        if(getClass()!=obj.getClass()) return false;

        Product other  = (Product) obj;

        return(Objects.equals(this.productId,other.productId));
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(this.productId);
    }
}
