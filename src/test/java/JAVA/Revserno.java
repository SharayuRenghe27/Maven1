package JAVA;

public class Revserno {
    public static void main(String[] args) {

        int no=1672;
        System.out.println("Entered no"+no);
        int rev=0;
        while(no!=0){
            int digit =no%10;
            rev=rev*10+digit;
            no=no/10;

        }
        System.out.println("\nReverse no"+rev);

    }
}
