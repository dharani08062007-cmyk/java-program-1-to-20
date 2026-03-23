import java.io.*;

class Board
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Government of Tamilnadu");
        System.out.println("Electricity Board");
        System.out.println("-----------------------");

        System.out.println("Bill Receipt    Date: 10.2.26");

        System.out.println("Enter the EB no:");
        int ebno = Integer.parseInt(br.readLine());

        System.out.println("Enter the Customer name:");
        String name = br.readLine();

        System.out.println("Enter the Previous Unit:");
        int prev = Integer.parseInt(br.readLine());

        System.out.println("Enter the Current Unit:");
        int curr = Integer.parseInt(br.readLine());

        int consumed = curr - prev;
        int amount = consumed * 5;

        System.out.println("Report");
        System.out.println("Unit Consumed in January: " + consumed + " units");
        System.out.println("Amount To be Paid: " + amount + " Rupees");
    }
}