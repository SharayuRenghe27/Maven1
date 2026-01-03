package JAVA;

public class CharOccuranceInString {
    public static void main(String[] args) {
        String s="madaam";
        String s1=s.toLowerCase();
        char c='D';
        char c1= Character.toLowerCase(c);

        System.out.print("Given string  - "+s1+"\n and char - "+c1);

        int count=countchar(s1,c1);
        System.out.println("\nchar occurance - "+count);


    }
    public static int countchar(String s1, char c1)
    {
        int count=0;
        for(int i=0; i<s1.length()-1; i++){
            if(s1.charAt(i)==c1){
                count++;
            }

        }
        return count;
    }
}
