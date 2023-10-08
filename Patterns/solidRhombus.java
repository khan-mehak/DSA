package Patterns;

public class solidRhombus {
    public static void solidRhom(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("solid rhombus pattern :");
        solidRhom(5);
    }
    
}
