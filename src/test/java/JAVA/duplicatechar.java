package JAVA;

public class duplicatechar {
    public static void main(String[] args) {
        String s1="abcdabffs";
        int slength =s1.length();
        System.out.println("Duplicate char-");
        for (int i=0; i < slength;  i++){
            for (int j=i+1; j < slength; j++){
                if(s1.charAt(i)== s1.charAt(j)) {
                    System.out.print(s1.charAt(i)+", ");
                    break;
                }
            }

        }

    }
}
