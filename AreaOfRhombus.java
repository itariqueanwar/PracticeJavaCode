import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Diagonal 1: ");
        int diagonal1 = sc.nextInt();
        System.out.print("Enter Diagonal 2: ");
        int diagonal2 = sc.nextInt();

        int area = (diagonal1*diagonal2)/2;

        System.out.println("Area of Rhombus: "+area);
    }
}
