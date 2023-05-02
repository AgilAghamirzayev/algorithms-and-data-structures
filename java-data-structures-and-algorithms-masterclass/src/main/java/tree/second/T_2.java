package tree.second;

import java.io.PrintWriter;
import java.util.Scanner;

public class T_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        double a = in.nextDouble();
        System.out.print("Enter the value of B: ");
        double b = in.nextDouble();
        System.out.print("Enter the value of C: ");
        double c = in.nextDouble();
        System.out.print("Enter the value of D: ");
        double d = in.nextDouble();

        // Output the multiplication table to the console
        for (double x = b; x <= c; x += d) {
            double result = a * x;
            System.out.println(a + " X " + x + " = " + result);
        }

        // Output the multiplication table to a file
        try (PrintWriter out = new PrintWriter("mult_table.txt")) {
            for (double x = b; x <= c; x += d) {
                double result = a * x;
                out.println(a + " X " + x + " = " + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}