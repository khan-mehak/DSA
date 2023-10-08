package Patterns;

public class star {
    public static void starPattern(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("STAR PATTERNS IS AS FOLLOWS: ");
        starPattern();
    }
}
