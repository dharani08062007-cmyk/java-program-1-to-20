import java.util.Scanner;

public class Arith {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        int add, sub, mul;
        double div;

        System.out.println("Arithmetic Operations");
        System.out.println("----------------------");

        System.out.print("Enter First number : ");
        a = sc.nextInt();

        System.out.print("Enter the Second number : ");
        b = sc.nextInt();

        add = a + b;
        sub = a - b;
        mul = a * b;
        div = (double) a / b;

        System.out.println("\nResult");
        System.out.println("Add = " + add);
        System.out.println("Sub = " + sub);
        System.out.println("Mul = " + mul);
        System.out.println("Div = " + div);

        sc.close();
    }
}