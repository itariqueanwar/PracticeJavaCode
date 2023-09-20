// 8. To find out whether the given String is Palindrome or not.

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        int i = 0;
        int j = str1.length() -1;
        while (i<j){
            if (str1.charAt(i) != str1.charAt(j)){
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.print("It's Palindrome.");
    }
}
