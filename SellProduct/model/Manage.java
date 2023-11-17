package SellProduct.model;

import java.util.ArrayList;
import java.util.List;

public class Manage {
    List<Product> productList = new ArrayList<>();
    List<Bill> billList = new ArrayList<>();
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

    public void insertId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == this.productList.get(i).getId()) {
                System.out.println(id);
            }
        }
    }

    public void insertQuantity() {
        int a = 1;
        for (Product product : productList) {
            if (a <= product.getQuantityInStock() && a > 0) {
                System.out.println(a);
            }else if (a > product.getQuantityInStock()){
                System.out.println("Quá số lượng mặt hàng hiện có");
            }else {
                System.out.println("Không hợp lệ");
            }
        }
    }

    public void insertName(Bill bill){
        billList.add(bill);
    }

}
