import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Test constructor rectangle 1:
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(15);
        rectangle.setWidth(10);
        display(rectangle);

        //Test constructor rectangle 2:
        Rectangle rectangle1 = new Rectangle(4, 5);
        display(rectangle1);

        //Test constructor rectangle 3"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều rộng: ");
        int width = scanner.nextInt();
        System.out.print("Nhập vào chiều dài: ");
        int length = scanner.nextInt();
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(width);
        rectangle2.setLength(length);
        display(rectangle2);
    }

    public static void display(Rectangle rectangle) {
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
    }
}
