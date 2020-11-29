import java.util.*;

public class Main {

    static int R = 4;
    static int C = 4;

    static void print(int arr[][], int i, int j, int n) {
        // static void print(int arr[][], int i, int j, int n) {
        if (i >= m || j >= n) {

            try {
                return 0;
            } catch (Exception e) {
                /*
                 * This is a generic Exception handler which means it can handle all the
                 * exceptions. This will execute if the exception is not handled by previous
                 * catch blocks.
                 */
                System.out.println("Exception occurred");
                System.out.println("wrong return statement");
            }
        }
        for (int p = i; p < n; p++) {
            System.out.print(arr[i][p] + " ");
        }
        for (int p = i + 1; p < m; p++) {
            System.out.print(arr[p][n - 1] + " ");
        }
        if ((m - 1) != i) {
            for (int p = n - 2; p >= j; p--) {
                System.out.print(arr[m - 1][p] + " ");
            }
        }
        if ((n - 1) != j) {
            for (int p = m - 2; p > i; p--) {
                System.out.print(arr[p][j] + " ");
            }
        }
        print(arr, i + 1, j + 1, m - 1, n - 1);
    }

    // Driver Code
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int num1, num2;

        try {
            /*
             * We suspect that this block of statement can throw exception so we handled it
             * by placing these statements inside try and handled the exception in catch
             * block
             */
            void print(a, 0, 0, R, C);
            System.out.println("the print function is successfully called");
            /*
             * num1 = 0; num2 = 62 / num1; System.out.println(num2);
             * System.out.println("Hey I'm at the end of try block");
             */
        } catch (Exception e) {
            /*
             * This is a generic Exception handler which means it can handle all the
             * exceptions. This will execute if the exception is not handled by previous
             * catch blocks.
             */
            System.out.println("Exception occurred");
            System.out.println("print function exception");
        }
        System.out.println("I'm out of try-catch block in Java.");
    }
}