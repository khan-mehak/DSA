package Functions;

public class code {
    
        //first program using function
       
        // public static void printHello(){
        //     System.out.println("hello world");
        // }
    
        //function overloading
        public static int sum(int a,int b){
           return a+b;
        }
    
        public static float sum(float a,float b){
            return a+b;
        }
    
        public static void main(String[] args) {
           System.out.println(sum(3,5));
           System.out.println((float)sum(9.8f, 4.5f));
           
        }
    }
    

