package Practice01;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number-");
        int n=sc.nextInt();
        fibo(n);
    }
    static void fibo(int num){
        int num1=0;
        int num2=1;
        int count=0;
        System.out.println("The fibonacci series is-");
        while(count<num){
            System.out.print(num1+" ");
            int num3=num2+num1;
            num1=num2;
            num2=num3;
            count++;
        }
    }
}
