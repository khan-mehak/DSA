package Functions;

public class binTodec {
    //binary to decimal number
    public static void binToDec(int binum){
        int pow=0;
        int decNum=0;
        while(binum>0){
            int lastDigit=binum%10;
            decNum=decNum + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            binum=binum/10;
        }
        System.out.println("decimal of "+binum+" = "+decNum);
    }
    public static void main (String args[]){
        System.out.println("binary to deciaml conversion is : ");
        binToDec(1001);
    }
    
}
