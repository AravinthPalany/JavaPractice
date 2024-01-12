package Practice02;

import java.util.Scanner;

public class Removingrepeatingintegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array-");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements-");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the integer that occuring in array-");
        int val = sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++){
            if(a[j]!=val){
                a[count]=a[j];
                System.out.print(a[count]+" ");
                count++;
            }
        }
    }
}
