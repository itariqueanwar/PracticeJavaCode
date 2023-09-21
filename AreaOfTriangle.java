// 2. Area Of Triangle

import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of Triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        int height = sc.nextInt();

        int area = (base*height)/2;

        System.out.println("Area of Triangle: "+area);
    }
}
