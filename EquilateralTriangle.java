import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double side = sc.nextInt();

        double area = (Math.pow(side,2)*Math.sqrt(3))/4;
        System.out.println("Area of Equilateral Triangle: "+area);
    }
}
