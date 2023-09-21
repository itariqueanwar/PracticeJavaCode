import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int len = sc.nextInt();
        System.out.print("Enter Width: ");
        int wid = sc.nextInt();

        int perimeter = 2*(len+wid);

        System.out.println("Perimeter of Parallelogram is: "+perimeter);
    }
}
