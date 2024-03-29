import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Product nyCong = new Product("Ny Công", 500, 1);
    static Product nyKhoa = new Product("Ny Khoa", 200, 10);
    static Product[] products = {nyCong, nyKhoa};


    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản Lý Sản Phẩm");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm sản phẩm");
            System.out.println("0. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    display();
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                    case 5:
                    findByName();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

    public static void display() {
        sort();
        for (Product p : products) {
            System.out.println(p.display());
        }
    }

    public static void addProduct() {
        System.out.println("Nhập name sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập price sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quantity sản phẩm");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name, price, quantity);

        Product[] productsNew = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            productsNew[i] = products[i];
        }
        productsNew[productsNew.length - 1] = product;
        products = productsNew;
        sort();

    }

    public static void editProduct() {
        System.out.println("Vị trí sản phẩm muốn sửa: ");
        int index = scanner.nextInt();
        scanner.nextLine();/// Nếu không ăn input Int thêm dòng scanner.nextLine()
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                System.out.println("Nhập name: ");
                String newName = scanner.nextLine();
                System.out.println("Nhập Price: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Nhập quanlity: ");
                int newQuanlity = scanner.nextInt();

                products[i].name = newName;
                products[i].price = newPrice;
                products[i].quantity = newQuanlity;
            }
        }
        sort();
    }

    public static void deleteProduct() {
        System.out.println("Bạn muốn xóa sản phẩm vị trí nào");
        int index = scanner.nextInt();
        scanner.nextLine();
        Product[] newProduct = new Product[products.length - 1];
        for (int i = 0; i < products.length; i++) {
            if (i < index) {
                newProduct[i] = products[i];
            } else if (i > index) {
                newProduct[i] = products[i + 1];
            }
        }
        products = newProduct;
        sort();
    }

    public static void sort() {
        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[j].price < products[i].price) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
    }
    public static void findByName(){
        System.out.println("Hãy nhập tên sản phẩm");
        boolean isFound = false;
        String find = scanner.nextLine();
        String result = null;
        for (int i =0; i< products.length; i++){
            if(products[i].getName().equals(find)){
               isFound = true;
               result = products[i].display();
                break;
            }
        }
        if(isFound){
            System.out.println(result);
        }else {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
}
