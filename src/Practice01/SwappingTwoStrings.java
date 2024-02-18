package Practice01;

public class SwappingTwoStrings {
    public static void main(String[] args) {
        /*
        This is used to swap strings without using temp variable
         */

        String s1= "Good";
        String s2= "Morning";

        s1 = s1+s2;

        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());

        System.out.println(s1+" "+s2);


        /*
       This below code is swap two strings using temp variable

        String s1= "Good";
        String s2= "Morning";

        String temp;

        temp=s1;
        s1=s2;
        s2=temp;

        System.out.println(s1+" "+s2);

         */
    }
}
