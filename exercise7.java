// Student Id : C0893432 , Harshavardhan Babu Gondipalli

public class exercise7 {

    public static void main(String[] args) {
        System.out.println("Tables of multiplication");

        for (int x = 2; x <= 10; x++) {
            System.out.println("Table of " + x + " :");
            for (int y = 1; y <= 10; y++) {
                System.out.print(y + " * " + x + " = " + (x * y));
                if (y < 10) {
                    System.out.print("  ");
                } else {
                    System.out.println();
                }
            }
        }
    }

}
