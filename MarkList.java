import java.io.*;

            System.out.println("Grade: B");
    }
}
class MarkList
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Student Mark List");

        System.out.println("Enter the enrollment no:");
        String s1 = br.readLine();

        System.out.println("Enter the name:");
        String s2 = br.readLine();

        System.out.println("Enter Java mark:");
        String s3 = br.readLine();
        int m1 = Integer.parseInt(s3);

        System.out.println("Enter COS mark:");
        String s4 = br.readLine();
        int m2 = Integer.parseInt(s4);

        System.out.println("Enter OS mark:");
        String s5 = br.readLine();
        int m3 = Integer.parseInt(s5);

        int tot = m1 + m2 + m3;
        System.out.println("Total mark: " + tot);

        int avg = tot / 3;
        System.out.println("Average mark: " + avg);

        if(m1 >= 35 && m2 >= 35 && m3 >= 35)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        if(tot >= 250)
            System.out.println("Grade: O");
        else if(tot >= 200)
            System.out.println("Grade: A+");
        else if(tot >= 150)
            System.out.println("Grade: A");
        else