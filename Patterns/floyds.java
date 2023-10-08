package Patterns;

public class floyds {
    public static void printFloyds(int n) {
        int num = 1;
        // outer loopp
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("floyd's triangle is as follows");
        printFloyds(5);
    }

}
