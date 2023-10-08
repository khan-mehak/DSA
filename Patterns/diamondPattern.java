package Patterns;

public class diamondPattern {
    public static void printDiamond(int n){
        //outer loop
          for(int i=1;i<=n;i++){
            //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
         }

         for(int i=n;i>=1;i--){
            //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
         }
    }

     public static void printDiamond1(int n){
        //outer loop
          for(int i=1;i<=n;i++){
            //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
         }

         for(int i=n-1;i>0;i--){
            //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
         }
    }
    public static void main(String[] args) {
        System.out.println("diamond pattern");
        printDiamond1(5);
    }
}
