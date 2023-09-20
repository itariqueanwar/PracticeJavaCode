// 6. Input currency in rupees and output in USD.

import java.util.Scanner;
public class InrToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rupees: ");
        int inr = sc.nextInt();
        float $ = 82.98f;
        float amount = inr*$;
        System.out.println(inr+" rupees in dollar is equal to: "+amount);
    }
}
