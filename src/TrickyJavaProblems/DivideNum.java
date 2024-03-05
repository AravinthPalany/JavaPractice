package TrickyJavaProblems;

public class DivideNum {
    /*
    What will be the output when we divide a number by zero
    Number is float or double
    for Integer case it throws Arithmetic exception
     */
    public static void main(String[] args) {
        System.out.println(9.0/0);
        System.out.println(12.33f/0);
        System.out.println(10/0.0);
        System.out.println(19.99999d/0);
        //System.out.println(0/0); - This gives Arithmetic Exception
        System.out.println(0.0/0);
        System.out.println(0.0/0.0);
        System.out.println(12.87/0.0);
    }
}
