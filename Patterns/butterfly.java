package Patterns;

public class butterfly {
    public static void printButterfly(int n){
    //1st half
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
       //2nd half
    for(int i=n-1;i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }


    }
    public static void main(String[] args) {
        System.out.println("butterfly pattern using java ");
        printButterfly(5);
    }
}
