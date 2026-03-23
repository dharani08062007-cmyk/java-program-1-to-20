import java.io.*;

class Gurubalan {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Method to find factorial
    void fact() throws IOException {
        System.out.println("Factorial");
        System.out.println("Enter the number:");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("Fact: " + f);
    }

    // Method to find sum of N numbers
    void sum() throws IOException {
        System.out.println("Sum of N Numbers");
        System.out.println("Enter the number:");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        int s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + i;
        }

        System.out.println("Sum: " + s);
    }

    public static void main(String[] args) throws IOException {
        Gurubalan g = new Gurubalan();

        g.fact();
        g.sum();
    }
}