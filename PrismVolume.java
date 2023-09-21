import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                 1. Triangular\s
                 2. Rectangular\s
                 3. Square\s
                 4. Pentagonal\s
                 5. Hexagonal\s
                 Type of Prism (1-8):""");
        int prism = sc.nextInt();

        if (prism==1){
            System.out.print("Enter Base: ");
            int base = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();
            System.out.print("Enter length: ");
            int len = sc.nextInt();

            int triangularPrism = (base*height*len)/2;
            System.out.print("Volume of Triangular Prism is: "+triangularPrism);

        } else if (prism == 2) {
            System.out.print("Enter Length: ");
            int len = sc.nextInt();
            System.out.print("Enter width: ");
            int width = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();

            int rectangularPrism = (len*width*height);
            System.out.print("Volume of Rectangular Prism is: "+rectangularPrism);

        } else if (prism == 3) {
            System.out.print("Enter base: ");
            int base = sc.nextInt();
            System.out.print("Enter length: ");
            int len = sc.nextInt();

            double squarePrism = Math.pow(base,2)*(len);
            System.out.print("Volume of Square Prism is: "+squarePrism);

        } else if (prism == 4) {
            System.out.print("Enter Apothem: ");
            int apothem = sc.nextInt();
            System.out.print("Enter base: ");
            int base = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();

            int pentagonalPrism = (5/2)*apothem*base*height;
            System.out.print("Volume of Pentagonal Prism: "+pentagonalPrism);

        } else if (prism == 5) {
            System.out.print("Enter Apothem: ");
            int apothem = sc.nextInt();
            System.out.print("Enter base: ");
            int base = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();

            int hexagonalPrism = 3*(apothem*base*height);
            System.out.print("Volume of Hexagonal Prism is: "+hexagonalPrism);

        } else {
            System.out.print("Invalid Input");
        }
    }
}
