package SellProduct.model;

import java.util.ArrayList;
import java.util.List;

public class Manage {
    List<Product> productList = new ArrayList<>();

    List<Bill> billList = new ArrayList<>();

    public Manage(){
        productList.add(new Product(32 , "A" , 7 , 80));
        productList.add(new Product(20, "B" , 6 , 100));
        productList.add(new Product(34 , "C" , 4 , 20));
        productList.add(new Product(56 , "D" , 10 , 50));
        productList.add(new Product(10 , "E" , 80, 0));
    }

    public void showProductList() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void findByname(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public void productInStock() {
        for (Product product : productList) {
            if (product.getQuantityInStock() > 0) {
                System.out.println("Sản phẩm" + product.getName() + "Còn" + product.getQuantityInStock());
            }
        }
    }

    public boolean checkId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == this.productList.get(i).getId()) {
                System.out.println(id);
                return true;
            }
        }
        System.out.println("Hãy nhập lại");
        return false;
    }

    public boolean checkQuantity(int a) {
        for (Product product : productList) {
            if (a <= product.getQuantityInStock() && a > 0) {
                System.out.println(a);
                return true;
            } else if (a > product.getQuantityInStock()) {
                System.out.println("Quá số lượng mặt hàng hiện có");
                return false;
            } else {
                System.out.println("Không hợp lệ");
                return false;
            }
        }
        return false;
    }

    public void insertBill(Bill bill){
        billList.add(bill);
    }

    public void bill(){
        for (Bill bill:billList) {
            System.out.println(bill);
        }
    }

}
