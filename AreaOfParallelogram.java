import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        int area = base*height;

        System.out.println("Area Of Parallelogram: "+area);
    }
}
