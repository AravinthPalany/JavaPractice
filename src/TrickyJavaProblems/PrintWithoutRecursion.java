package TrickyJavaProblems;

import java.util.Arrays;
import java.util.BitSet;

public class PrintWithoutRecursion {
    /*
    This program we have written using two methods without using any loops and recursion methods
    1.Arrays Fill
    2.BitSet
     */
    public static void main(String[] args) {
        Object num[] = new Object[100];
        Arrays.fill(num , new Object(){
            int count = 0;
            @Override
            public String toString(){
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));

        String set = new BitSet() {{set(1,101);}}.toString();
        System.out.append(set, 1, set.length());
    }
}
