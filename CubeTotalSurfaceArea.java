import java.util.Scanner;

public class CubeTotalSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        int side = sc.nextInt();

        double cubeSurfaceArea = 6*Math.pow(side,2);

        System.out.println("Total Surface Area of Cube is: "+cubeSurfaceArea);
    }
}
