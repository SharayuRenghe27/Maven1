package JAVA;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String s1 = "aabubccfrp";
        s1 = s1.toLowerCase();
        System.out.println("String= "+s1);

        char firstNonRepeatedChar = 'N';
        boolean unique = true;

        for (int i = 0; i < s1.length(); i++) {
            unique = true;
            for (int j = 0; j < s1.length(); j++) {
                if (i != j && s1.charAt(i) == s1.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                firstNonRepeatedChar = s1.charAt(i);
                break;
            }

        }
        if (unique) {
            System.out.println("First Non Repeated char is = " + firstNonRepeatedChar);
        } else
            System.out.println("No Repeated Char");
    }
    }

