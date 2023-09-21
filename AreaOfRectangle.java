import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = sc.nextInt();

        int area = len*breadth;

        System.out.println("Area of Rectangle: "+area);
    }
}
