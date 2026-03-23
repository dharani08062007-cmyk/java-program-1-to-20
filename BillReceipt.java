import java.util.Scanner;

public class BillReceipt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productNo;
        String particulars;
        double price, amount, gst, total;
        int quantity;

        System.out.println("Dharani Computer Education");
        System.out.println("Bill Receipt");
        System.out.println("----------------------");

        System.out.print("Enter the product no : ");
        productNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Particulars : ");
        particulars = sc.nextLine();

        System.out.print("Enter the Amt : ");
        price = sc.nextDouble();

        System.out.print("Enter the Quantity : ");
        quantity = sc.nextInt();

        amount = price * quantity;
        gst = amount * 0.12;
        total = amount + gst;

        System.out.println("\nEnter the Amt : " + amount);
        System.out.println("GST (12%) : " + gst);
        System.out.println("Total Amt : " + total);

        sc.close();
    }
}