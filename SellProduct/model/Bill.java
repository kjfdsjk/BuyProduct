package SellProduct.model;

public class Bill {
    private String nameCustomer;
    private String nameProduct;
    private int quantity;
    private double time;

    public Bill(String nameCustomer, String nameProduct, int quantity, double time) {
        this.nameCustomer = nameCustomer;
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.time = time;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SellProduct.model.Bill{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", quantity=" + quantity +
                ", time=" + time +
                '}';
    }
}
