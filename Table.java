import java.io.*;

class Table
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Table Program");
        System.out.println("Enter the total number:");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        System.out.println("15 Table:");

        for(int i = 1; i <= n; i++)
        {
            System.out.println("15 x " + i + " = " + (15 * i));
        }
    }
}