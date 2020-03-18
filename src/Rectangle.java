import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float width; {
            System.out.println("Nhập vào chiều rộng: ");
            width = scanner.nextFloat();
        }

        float height; {
            System.out.println("Nhập vào chiều dài: ");
            height = scanner.nextFloat();
        }

        float area = width * height; {
            System.out.println("Diện tích hình chữ nhật là:" + "\n" + area);
        }
    }
}
