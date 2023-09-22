import java.util.Scanner;

public class CylinderCurveSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter Height: ");
        int height = sc.nextInt();

        double curveSurfaceArea = 2*Math.PI*radius*height;
        System.out.println("Curve Surface Area of Cylinder is: "+curveSurfaceArea);
    }
}
