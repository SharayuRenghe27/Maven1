package JAVA;

public class StringPalidrome {
    public static void main(String[] args) {String s="madaam", rev="";
        String s1=s.toLowerCase();
        System.out.print("Given string  - "+s1+"\n");

        if(checkpalindrom(s1))
            System.out.println("String is palindrom");
        else
            System.out.println("String is not palindrom");

    }
    public static boolean checkpalindrom(String s1)
    {
        int first=0, last=s1.length()-1;

        while(first<last){
            if(s1.charAt(first)!=(s1.charAt(last))){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }


}
