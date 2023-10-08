package Patterns;

public class hollowRhombus {
    public static void hollowRhom(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            //spaces beside rhombus
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars and spaces inside rhombus
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        System.out.println("solid hollow rhombus :");
        hollowRhom(5);
    }

}
