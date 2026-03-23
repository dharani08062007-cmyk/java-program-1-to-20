import java.io.*;

class Sum
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Sum of N Numbers");
        System.out.println("----------------");

        System.out.println("Enter the number:");
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }

        System.out.println("Report:");
        System.out.print("1 + 2 + 3 + 4 + 5 = ");
        System.out.println(sum);
    }
}