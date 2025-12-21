package Practices.JavaPrac;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {

        System.out.println("Enter no");
        Scanner scanner=new Scanner(System.in);
        int no=scanner.nextInt();

        if(isPrimeno(no))
            System.out.println("No is prime ");
        else
            System.out.println("Not prime no");
    }
    public static boolean isPrimeno(int no){
        if (no<=1)
            return false;
        if(no==2)
            return true;
        for(int i=3;i * i<=no;i+=2)
            if(no%i==0)
                return false;

        return true;


    }
}
