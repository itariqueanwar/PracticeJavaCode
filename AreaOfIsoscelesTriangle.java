import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();;
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        int area = (base*height)/2;

        System.out.println("Area Of Isosceles Triangle: "+area);
    }
}
