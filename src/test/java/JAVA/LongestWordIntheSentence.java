package JAVA;

public class LongestWordIntheSentence {
    public static void main(String[] args) {

        String sentence="I am a girl and a woman too";
        System.out.println(sentence);

        String []words=sentence.split(" ");
        String longword="";

        for (int i = 0; i < words.length; i++)
        {
            int lwlenghth=longword.length();
            int wlenghth=words[i].length();

            if(wlenghth>lwlenghth)
                longword=words[i];
        }
        System.out.println("longest word - "+longword);
    }
}
