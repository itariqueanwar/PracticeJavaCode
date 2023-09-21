import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float radius = sc.nextFloat();

        double perimeter = 2*Math.PI*radius;

        System.out.println("Perimeter of Circle is: "+perimeter);
    }
}
