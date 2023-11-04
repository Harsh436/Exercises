// Student Id : C0893432 , Harshavardhan Babu Gondipalli

import java.util.Scanner;

public class Pret {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double S0, r, ir;

        do {
            System.out.print("Enter loan amount (enter only positive): $");
            S0 = scanner.nextDouble();
        } while (S0 <= 0);

        do {
            System.out.print("Enter monthly payment (enter only positive): $");
            r = scanner.nextDouble();
        } while (r <= 0);

        do {
            System.out.print("Enter monthly interest rate (enter only between 0 and 1): ");
            ir = scanner.nextDouble();
        } while (ir <= 0 || ir >= 1);

        int month = 0;
        double interestSum = 0.0;

        while (S0 > 0) {
            double interest = ir * S0;
            interestSum += interest;
            S0 -= (r - interest);
            month++;
        }

        System.out.println("Sum of interest : $" + interestSum);
        System.out.println("Duration(months) : " + month);
        scanner.close();
    }
}
