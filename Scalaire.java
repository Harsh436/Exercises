import java.util.Scanner;

public class Scalaire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxLength = 10;
        double[] vect1 = new double[maxLength];
        double[] vect2 = new double[maxLength];
        boolean err = true;
        while (err) {
            try {
                System.out.print("Enter the length of the vectors : ");
                int n = scan.nextInt();

                while (n < 1 || n > maxLength) {
                    System.out.println("Please enter the valid size between 1 nd " + maxLength);
                    n = scan.nextInt();
                }

                System.out.println("Enter the values of Vector 1 ");
                for (int i = 0; i < n; i++) {
                    System.out.println("vect1[" + i + "] : ");
                    vect1[i] = scan.nextDouble();

                }

                System.out.println("Enter the values of Vector 2 ");
                for (int i = 0; i < n; i++) {
                    System.out.println("vect2[" + i + "] : ");
                    vect2[i] = scan.nextDouble();

                }

                Double scalarValue = calculateScalarProduct(vect1, vect2, n);
                System.out.println("The scalar value for the give vectors is : " + scalarValue);
                scan.close();
                err = false;
            } catch (Exception ex) {
                System.out.println("Enter the valid input ");
                err = true;
                scan.nextLine();
            }

        }
    }

    public static double calculateScalarProduct(double[] vect1, double[] vect2, int n) {
        double scalarVal = 0;
        for (int i = 0; i < n; i++) {
            scalarVal += vect1[i] * vect2[i];
        }
        return scalarVal;
    }
}
