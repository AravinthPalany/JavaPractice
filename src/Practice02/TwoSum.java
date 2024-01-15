package Practice02;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5};
        System.out.println(Arrays.toString(add(a, 9)));
    }
        public static int[] add(int[] a2,int target) {
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < a2.length; i++) {
                int r = target - a2[i];
                if (h.containsKey(r)) {
                    int a1[] = {h.get(r), i};
                    return a1;
                }
                h.put(a2[i], i);
            }
            return null;
        }
        //System.out.println(Arrays.toString(a1));

}
