package Practice02;

import java.util.Scanner;

public class PalindromeNumber {
    /*
    Note: This is program written for number logic to check palindrome
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check-");
        int n = sc.nextInt();
        int x = n;
        int rev = 0;
        while(n>0){
            int d = n%10;
            rev = (rev*10)+d;
            n=n/10;
        }
        if(x==rev){
            System.out.println(x+" is a Palindrome");
        }
        else{
            System.out.println(x+" is not a Palindrome");
        }
    }
}
