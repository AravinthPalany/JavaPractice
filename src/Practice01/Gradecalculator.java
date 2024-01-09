package Practice01;

import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        /*90-100 - Grade A
        80-89 - Grade B
        70-79 - Grade C
        60-69 - Grade D
        50-59 - Grade E
        below 49 - Grade F means fail
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark -");
        int n = sc.nextInt();
        if(n>=90&&n<=100){
            System.out.println("Grade 'A'");
        }
        else if(n>=80&&n<=89){
            System.out.println("Grade 'B'");
        }
        else if(n>=70&&n<=79){
            System.out.println("Grade 'C'");
        }
        else if(n>=60&&n<=69){
            System.out.println("Grade 'D'");
        }
        else if(n>=50&&n<=59){
            System.out.println("Grade 'E'");
        }
        else{
            System.out.println("Grade 'F'");
        }
    }
}
