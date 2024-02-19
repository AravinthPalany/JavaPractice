package Practice01;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit-");
        int n = sc.nextInt();
        int temp=n,sum=0;
        while(temp>0){
            int rem = temp%10;
            sum+= rem;
            temp=temp/10;
        }
        System.out.println("The sum of the given digits is - "+ sum);
    }
}
