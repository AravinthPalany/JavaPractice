package TrickyJavaProblems;

public class StringCount {
    public static void main(String[] args) {
        /*
         How many String objects will be created?
         */
      //Ans: 3
        String s1 ="Hello World";//This will create only one object in string pool
        String s2 ="Hello World";
        String s3 = s1;
        String n1 = new String ("Hello World");//This will create two objects one in string pool and other in heap
        String n2 = new String ("Hello World");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
        System.out.println(n1==n2);
        System.out.println(s1==n2);
    }
}
