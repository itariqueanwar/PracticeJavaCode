import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        System.out.print("Enter width: ");
        int wid = sc.nextInt();

        int perimeter = 2*(len+wid);

        System.out.println("Perimeter of Rectangle is: "+perimeter);
    }
}
