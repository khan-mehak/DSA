package Patterns;

public class hollowRect{           
    public static void printHollow(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }

    public static void hollowRect1(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            
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
        System.out.println("hollow rectangle is as follows ");
        printHollow(5, 5);
    }
    
}
