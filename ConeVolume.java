import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        // (1/3) * π * r^2 * h

        // both methods are correct to find the volume of the cone

        // #1
        double volume = (Math.PI*Math.pow(radius,2)*height)/3;
        // #2
        double volume1 = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Volume of Cone is: "+volume);
        System.out.println("Volume: "+volume1);
    }
}
