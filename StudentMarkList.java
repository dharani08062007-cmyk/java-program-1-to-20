import java.util.Scanner;

public class StudentMarkList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regNo, name;
        int javaMark, osMark, ccwsMark;
        int total;
        double average;

        System.out.println("Student Mark List");

        System.out.print("Reg/Roll No : ");
        regNo = sc.nextLine();

        System.out.print("Name : ");
        name = sc.nextLine();

        System.out.print("Java Mark : ");
        javaMark = sc.nextInt();

        System.out.print("OS Mark : ");
        osMark = sc.nextInt();

        System.out.print("CCWS Mark : ");
        ccwsMark = sc.nextInt();

        total = javaMark + osMark + ccwsMark;
        average = total / 3.0;

        System.out.println("\n------ Mark Details ------");
        System.out.println("Reg No : " + regNo);
        System.out.println("Name : " + name);
        System.out.println("Java Mark : " + javaMark);
        System.out.println("OS Mark : " + osMark);
        System.out.println("CCWS Mark : " + ccwsMark);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);

        sc.close();
    }
}