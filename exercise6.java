// Student Id : C0893432 , Harshavardhan Babu Gondipalli

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        double x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        x = scanner.nextDouble();

        boolean belongs = false;

        // Check if x belongs to any of the intervals
        if ((x >= 2 && x < 3) || (x >= 0 && x <= 1) || (x >= -10 && x <= -2)) {
            belongs = true;
        }

        if (belongs) {
            System.out.println("x belongs to I");
        } else {
            System.out.println("x does not belongs to I");
        }

        scanner.close();
    }
}
