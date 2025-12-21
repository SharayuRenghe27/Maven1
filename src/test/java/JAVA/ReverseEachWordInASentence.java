package JAVA;

public class ReverseEachWordInASentence {
    public static void main(String[] args) {

        String sen="Hello World Java Programming";
        System.out.println(sen);

        String senrev= Reveachword(sen);
        System.out.println(senrev);
    }
    public static String Reveachword(String sen){

    String[] words=sen.split(" ");
    StringBuilder revsent=new StringBuilder();
    for (String word:words)
    {
        StringBuilder revword=new StringBuilder(word);
        revword.reverse();
        revsent.append(revword).append(" ");
    }
    return revsent.toString().trim();
    }
}
