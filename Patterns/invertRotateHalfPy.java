package Patterns;

public class invertRotateHalfPy {
    public static void printPyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("inverted rotate half pyramid");
        printPyramid(5);
    }

}
