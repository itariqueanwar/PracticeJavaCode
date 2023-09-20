// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class MathsOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Operator: (+,-,*,/) ");
        char operator = sc.next().charAt(0);

        if (operator == '+'){
            System.out.println("Sum of "+num1+" and "+num2+" is: "+(num1+num2));
        } else if (operator == '-') {
            System.out.println("Difference of "+num1+" and "+num2+" is: "+(num1-num2));
        } else if (operator == '*') {
            System.out.println("Sum of "+num1+" and "+num2+" is: "+(num1*num2));
        } else if (operator == '/') {
            System.out.println("Sum of "+num1+" and "+num2+" is: "+(num1/num2));
        } else {
            System.out.println("Invalid Input");
        }

    }
}
