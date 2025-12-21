package Practices.JavaPrac;

public class revstring {
    public static void main(String[] args) {

        String T="Tejas";
        String rev="";

        for (int i=T.length()-1;i>=0;i--)
        {
            rev=rev+T.charAt(i);

        }
        System.out.println("Rev name= "+rev);

    }
}
