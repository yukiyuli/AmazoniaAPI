package ca.vanier.amazoniaapi.entity;


public class products {
    private int productID;
    private String productName;
    private Long price ;

    public products(int productID, String productName, Long price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "products [productID=" + productID + ", productName=" + productName + ", price=" + price + "]";
    }
   
    


}
