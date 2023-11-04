import java.util.Arrays;

// Student Id : C0893432 , Harshavardhan Babu Gondipalli

public class sorting {
    public static void main(String[] args) {
        int[] arr = { 9, 56, 3, 78, 5, 1, 99, 0, 6, 7, 4 };
        int maxValue = findMax(arr);
        System.out.println("max value : " + maxValue);
        int minValue = findMin(arr);
        System.out.println("max value : " + minValue);
        doSort(arr, true);

        System.out.println("Array sorted : " + Arrays.toString(arr));
    }

    public static int findMin(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void doSort(int[] arr, boolean asc) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean swapNeeded = asc ? arr[j] > arr[j + 1] : arr[j] < arr[j + 1];
                if (swapNeeded) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
