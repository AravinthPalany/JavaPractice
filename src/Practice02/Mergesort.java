package Practice02;

import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array-");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements-");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(a[j]>a[k]){
                    temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }
            }
        }
        System.out.println("The sorted array is-");
        for(int c=0;c<n;c++){
            System.out.print(a[c]+" ");
        }
    }
}
