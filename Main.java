import SellProduct.model.Bill;
import SellProduct.model.Manage;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("===== MENU =====");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Xem sản phẩm còn hàng");
            System.out.println("4. Mua hàng");
            System.out.println("5. Xem danh sách đơn hàng");
            System.out.println("0. Thoát chương trình");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Danh sách sản phẩm hiện có");
                    manage.showProductList();
                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm");
                    String nameFind= scanner.nextLine();
                    manage.findByname(nameFind);
                case 3:
                    System.out.println("Các sản phầm còn hàng");
                    manage.productInStock();
                    break;
                case 4:
                    System.out.println("Hãy nhập ID sản phẩm");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Hãy nhập số lượng");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Hãy nhập tên của bạn");
                    String nameCustomer = scanner.nextLine();
                    if (manage.checkId(productId) && manage.checkQuantity(quantity)) {
                        Bill newBill = new Bill(productId, quantity, nameCustomer);
                        manage.insertBill(newBill);
                    } else {
                        System.out.println("Kiểm tra lại ID hoặc số lượng.");
                    }
                    break;
                case 5:
                    System.out.println("Danh sách đơn hàng của bạn");
                    manage.bill();
            }
        }
    }
}