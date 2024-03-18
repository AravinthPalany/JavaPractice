package TrickyJavaProblems;
/*
This is an interview question asking will the static block will be executed?
 */
public class StaticBlock {
        public static void main(String[] args) {
            System.out.println(Main.x);
        }
    }
    class Main{
        public static final int x = 100;
 //       public static int x = 100;
        static {
            System.out.println("main -- class static block...");
        }
}
