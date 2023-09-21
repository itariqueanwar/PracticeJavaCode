// 1. Area Of Circle Java Program

import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int radius = sc.nextInt();
        double area = (3.142 * radius * radius);
        System.out.println("Area of circle is: "+area);
    }
}
