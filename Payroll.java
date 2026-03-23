import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId;
        String empName;
        double salary;

        System.out.println("Employee Payroll System");

        System.out.print("Enter the EMP ID: ");
        empId = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter the EMP Name: ");
        empName = sc.nextLine();

        System.out.print("Enter the Salary: ");
        salary = sc.nextDouble();

        double bonus = salary * 0.20;
        double increment = salary * 0.10;
        double grossPay = salary + bonus + increment;

        double rental = salary * 0.03;
        double lic = salary * 0.02;

        double netPay = grossPay - (rental + lic);

        System.out.println("\nIncome:");
        System.out.println("Bonus (20% of Salary): Rs. " + bonus);
        System.out.println("Increment (10% of Salary): Rs. " + increment);
        System.out.println("Gross Pay: Rs. " + grossPay);

        System.out.println("\nExpenditure:");
        System.out.println("Rental (3% of Salary): Rs. " + rental);
        System.out.println("LIC (2% of Salary): Rs. " + lic);

        System.out.println("\nNet Pay (Take Home): Rs. " + netPay);
    }
}