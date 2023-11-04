// Student Id : C0893432 , Harshavardhan Babu Gondipalli

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner myScan1 = new Scanner(System.in);

        System.out.println("Enter the number 1 : ");
        int num1 = myScan1.nextInt();
        Scanner myScan2 = new Scanner(System.in);
        System.out.println("Enter the number 2 : ");
        int num2 = myScan2.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int gcdOutput = findPGDC(max, min);
        System.out.println("The greatest common divisor is : " + gcdOutput);
        myScan1.close();
        myScan2.close();
    }

    public static Integer findPGDC(Integer max, Integer min) {
        int gcd = 0;
        while (min != max) {
            int minLoop = Math.min(max - min, min);
            int maxLoop = Math.max(max - min, min);
            max = maxLoop;
            min = minLoop;
        }
        gcd = min;
        return gcd;
    }

}
