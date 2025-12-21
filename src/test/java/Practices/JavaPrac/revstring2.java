package Practices.JavaPrac;

public class revstring2 {
    public static void main(String[] args) {
        String name="Hanumanji";
        String rev="";
        for (int i =name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("OG name="+name+"\nRev name="+rev);
    }
}

