package Patterns;

public class halfPyramid {
    public static void halfPyramidPattern(){
        int n=10;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }

        public static void inverthalfPyramidPattern(){
        int n=10;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=n-line+1;number++){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }

    public static void halfPyramidPattern1(){
        int n=10;
        int num=1;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("half pyramid pattern");
        halfPyramidPattern();
        System.out.println("printing invert half pyramid");
        inverthalfPyramidPattern();
        System.out.println("printing half pyramid without repetition");
        halfPyramidPattern1();

    }
}
