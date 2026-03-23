import java.io.*;

class Big
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Find the biggest number");
        System.out.println("-----------------------");

        System.out.println("Enter A:");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter B:");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Enter C:");
        int c = Integer.parseInt(br.readLine());

        System.out.println("Enter D:");
        int d = Integer.parseInt(br.readLine());

        int big = a;

        if(b > big)
            big = b;

        if(c > big)
            big = c;

        if(d > big)
            big = d;

        System.out.println("Result:");
        System.out.println("The biggest number is " + big);
    }
}