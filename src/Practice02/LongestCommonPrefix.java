package Practice02;

import java.util.Arrays;
/*
This is a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String st[] ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(st));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index = 0;
        while(index<s1.length()){
            if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return index==0?"":s1.substring(0,index);
    }
}
