package Practice02;

import java.util.HashMap;
import java.util.Scanner;
/*
Note: This code written for converting Roman letters to integers.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman letter in Caps-");
        String s = sc.nextLine();
        HashMap<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int result = m.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                result-= m.get(s.charAt(i));
            }
            else{
                result+= m.get(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
