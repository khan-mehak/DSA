package Patterns;

public class invertStar {
    public static void invertPattern() {
        int n = 7;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("inverted star pattern");
        invertPattern();

    }

}
