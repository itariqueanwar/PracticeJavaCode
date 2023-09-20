// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter Time: ");
        int time = sc.nextInt();
        System.out.print("Enter Rate: ");
        float rate = sc.nextFloat();

        float SimpleInterest = ((principal*time*rate)/100);
        System.out.println("Simple Interest is: "+SimpleInterest);


    }
}
