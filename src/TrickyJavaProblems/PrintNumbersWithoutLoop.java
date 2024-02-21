package TrickyJavaProblems;

import java.util.stream.IntStream;

public class PrintNumbersWithoutLoop {
    /*
    In this program we have to print numbers from 1 to 100 without using loops.
    we can use two solutions-
    1.Recursive function
    2.Java Streams
     */
    public static void main(String[] args) {
        //number(1,100);
        IntStream.range(1,101).forEach(i -> System.out.println(i));
    }
    public static void number(int start, int end){
        if(start<=end){
            System.out.println(start);
            start++;
            number(start , end);
        }
    }
}
