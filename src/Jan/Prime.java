package Jan;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number-");
        int N =s.nextInt();
        int count=0,m=0;
        m=N/2;
        if (N == 0||N == 1) {
            System.out.println(N + " is not a prime");
        }
        else{
            for(int i=2;i<=m;i++){
                if(N%i==0){
                    System.out.println(N + " is not a prime");
                    count=1;
                    break;
                }
                }
            if(count==0){
                System.out.println(N+" is a prime");
            }
        }

    }
}
