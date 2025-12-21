package JAVA;

import java.util.Scanner;

public class Factorial  {
    public static void main(String[] args) {

        System.out.println("4*3*2*1");
        System.out.println("Enter no");
        Scanner scanner=new Scanner(System.in);
        int no=scanner.nextInt();
        int fact = 1;
        for (int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial="+fact);

    }
}
