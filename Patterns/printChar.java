package Patterns;

public class printChar {
    public static void printCharPattern() {
        int n = 5;
        char ch = 'a';
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void invertprintCharPattern() {
        int n = 5;
        char ch = 'a';
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int chars = 1; chars <= n - i + 1; chars++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("printing character pattern");
        printCharPattern();
        System.out.println("printing character pattern inverse");
        invertprintCharPattern();
    }

}
