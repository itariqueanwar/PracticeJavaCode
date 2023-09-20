// 9. To find Armstrong Number between two given number.

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int temp = num1;
        int rem;
        int sum = 0;
        while (num1 > 0){
            rem = num1%10;
            num1 = num1/10;
            sum = sum + rem*rem*rem;
        }
        if (temp == sum){
            System.out.println("Its an Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }
    }
}
