// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println(num1+" is greater.");
        } else {
            System.out.println(num2+" is greater.");
        }
    }
}
