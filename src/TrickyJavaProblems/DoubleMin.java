package TrickyJavaProblems;

public class DoubleMin {
    public static void main(String[] args) {

        /*
        What is the value of double MIN_VALUE?
        Which one is bigger -> Double MIN_VALUE or 0.0d ?
        Which one is bigger Double MIN_VALUE or NEGATIVE INFINITY?
        */
        System.out.println(Double.MIN_VALUE); //is a +ve number
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.min (Double.MIN_VALUE, 0.0D));
        System.out.println(Math.min (Integer.MIN_VALUE, 0));
        System.out.println(Math.min (Float. MIN_VALUE, 0.0f));
        System.out.println(Float. MIN_VALUE); //is a +ve number
        System.out.println(Math.min (Double.MIN_VALUE, Double. NEGATIVE_INFINITY));
    }
}
