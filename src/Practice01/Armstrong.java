package Practice01;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check-");
        int n = sc.nextInt();
        int temp,digit=0,last=0,sum=0;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum += (Math.pow(last, digit));
            temp=temp/10;
        }
        if(n==sum){
            System.out.println("It is an Armstrong Number");
        }
        else{
            System.out.println("It is not an Armstrong Number");
        }
    }
}
