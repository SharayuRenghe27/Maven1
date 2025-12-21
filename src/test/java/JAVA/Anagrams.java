package JAVA;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String s1="Sharayu";
        String s2="uHaraSy";

        boolean result=areAnagram(s1,s2);
        System.out.println("It is an "+result);
    }

    public static boolean areAnagram(String s1, String s2)
    {
        char[] charArray1= s1.replace(" ","").toLowerCase().toCharArray();
        char[] charArray2= s2.replace(" ","").toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);

    }



}
