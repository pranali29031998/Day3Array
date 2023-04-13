package Com.bridgelabzdaytwo;

import java.util.Scanner;

public class ArithmeticOperationsminmax {
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int a = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int b = in.nextInt();

        System.out.printf("Sum of two integers: %d%n", a + b);
        System.out.printf("Difference of two integers: %d%n", a-b);
        System.out.printf("Product of two integers: %d%n", a * b);
        System.out.printf("Max integer: %d%n", Math.max(a, b));
        System.out.printf("Min integer: %d%n", Math.min(a, b));

}
}