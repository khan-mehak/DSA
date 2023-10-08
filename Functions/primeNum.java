package Functions;

import java.util.Scanner;

public class primeNum {
    public static boolean isPrime(int n){
    if(n==1){
    return false;
    }

    for(int i=2;i<n;i++){
    if(n%i==0){
    return false;
    }

    }
    return true;

    }

    public static void check(int n) {
        if (n == 1) {
            System.out.println("neither prime nor composite");

        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("not prime number");
                break;

            } else {
                System.out.println("prime number");
            }
        }

    }

    public static boolean check1(int n) {
        if (n == 1) {
            return false;

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }


    //all prime numbers till range code
    public static void primeInRange(int n){
        if(n==1){
            System.out.print("nothing");
        }
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // System.out.println("check whether the number is prime or not");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        sc.close();
        System.out.println(isPrime(n));
        System.out.println("prime number in the range are: ");
        primeInRange(n);
        check(n);
        System.out.println(check1(n));
       
       

    }
    
}
