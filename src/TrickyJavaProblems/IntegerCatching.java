package TrickyJavaProblems;

public class IntegerCatching {
    /*
    Here we are comparing two integers with (Integer Catching)
    In this method if we use numbers from -128 to 127 then it will take those values
    but outside this range it will give not equal ans
     */
    public static void main(String[] args) {
        Integer num1 =128;
        Integer num2 =128;
        if(num1 == num2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}
