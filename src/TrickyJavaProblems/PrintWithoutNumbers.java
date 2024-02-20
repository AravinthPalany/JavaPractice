package TrickyJavaProblems;

public class PrintWithoutNumbers {
    /*
    This program we have to print 1 to 100 without using any numbers in our code
     */
    public static void main(String[] args) {
        int k = 'Q'/'Q' ; //Value for this is one
        String s = "..........";// String with length 10

        for(int i= k ; i<=(s.length()*s.length()) ; i+=k){
            System.out.println(i);
        }
        // This is another logic using Ascii values
        for(int j= k ; j<='d' ; j+=k){
            System.out.println(j);
        }
    }
}
