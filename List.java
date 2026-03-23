import java.io.*;

class List
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Takshashila University");
        System.out.println("Ongur, Tindivanam");
        System.out.println("----------------------");
        System.out.println("Student Mark List");
        System.out.println("----------------------");

        System.out.println("Enter Enrollment no:");
        int eno = Integer.parseInt(br.readLine());

        System.out.println("Enter Student name:");
        String name = br.readLine();

        System.out.println("Enter Java mark:");
        int java = Integer.parseInt(br.readLine());

        System.out.println("Enter OS mark:");
        int os = Integer.parseInt(br.readLine());

        System.out.println("Enter CWS mark:");
        int cws = Integer.parseInt(br.readLine());

        int total = java + os + cws;
        int avg = total / 3;

        System.out.println("Total mark : " + total);
        System.out.println("AVG mark : " + avg);
    }
}