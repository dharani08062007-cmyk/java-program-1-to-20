import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n, a = 0, b = 1, c;

        System.out.println("Interview Program : 23");
        System.out.println("----------------------");
        System.out.println("Fibonacci Series");
        System.out.println("----------------");

        System.out.println("Enter the number :");
        n = sc.nextInt();

        System.out.println("\nReport");
        System.out.println("Fibonacci Series :");

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(", ");
            }

            c = a + b;
            a = b;
            b = c;
        }
    }
}