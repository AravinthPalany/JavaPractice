package Practice01;

import java.util.Scanner;

/*
This program is for removing non alpha Numeric characters and space in string
and check if it is palindrome or not
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int size=s.length();
        String rev="";
        for(int i=size-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("It is a Valid Palindrome");
        }
        else{
            System.out.println("It is not a Valid Palindrome");
        }
    }
}
