package Practice02;

import java.util.Scanner;
/*
Note: this is a sorted array so we have written code according to this sorted logic.
 */
public class Duplicatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array-");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements-");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int k = 0;
        for(int j=0;j<n;j++){
            if(j<n-1 && a[j]==a[j+1]){
                continue;
            }
            else{
                a[k]=a[j];
                k++;
            }
        }
        for(int l=0;l<k;l++){
            System.out.print(a[l]+" ");
        }
    }
}
