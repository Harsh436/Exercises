// Student Id : C0893432 , Harshavardhan Babu Gondipalli

import java.util.Scanner;
import java.util.InputMismatchException;

public class exercise5 {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        int num = 0;
        boolean flag = true;
        while (flag) {

            try {
                System.out.println("Enter the number");
                num = myScan.nextInt();
                if (num > 0) {
                    if (num % 2 == 0) {
                        System.out.println("The number is positive and even");
                    } else {
                        System.out.println("The number is positive and odd");
                    }
                } else if (num < 0) {
                    if (num % 2 == 0) {
                        System.out.println("The number is negative and even");
                    } else {
                        System.out.println("The number is negative and odd");
                    }
                } else {
                    System.out.println("The number is zero (and it is even)");
                }
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("Please enter a whole number");
                myScan.next();

            }

        }
        myScan.close();
    }
}