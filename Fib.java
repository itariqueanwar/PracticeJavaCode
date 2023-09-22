import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci Series you want: ");
        int fib = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int temp;

        for (int i = 1; i<=fib; i++){
            temp = num1+num2;
            System.out.print(temp+" ");
            num1 = num2;
            num2 = temp;
        }
    }
}
