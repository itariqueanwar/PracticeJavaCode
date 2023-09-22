import java.util.*;
public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int num1 = sc.nextInt();
        int temp1 = 0;
        int temp2 = 1;

        while (num1 > 0){
            int rem = num1%10;
            num1 = num1/10;
            temp1 = temp1 + rem;
            temp2 = temp2 * rem;


        }
        int result = temp2 - temp1;
        System.out.println(result);
    }

}
