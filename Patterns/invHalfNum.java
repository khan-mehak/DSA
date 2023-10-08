package Patterns;

public class invHalfNum {
    public static void printPyramid1(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void printPyramid10(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }

    public static void printPyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("invert rotate half pyramid with numbers");
        printPyramid(4);
    }
}
