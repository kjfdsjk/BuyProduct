import SellProduct.model.Manage;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("===== MENU =====");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Tìm kiếm trong khoảng giá");
            System.out.println("7. Sắp xếp theo cc tăng dần");
            System.out.println("8. Sắp xếp theo cc giảm dần");
            System.out.println("0. Thoát chương trình");

            int choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}