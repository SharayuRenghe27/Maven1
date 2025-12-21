package JAVA;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int no=scanner.nextInt();

        if(isArmstrongno(no))
            System.out.println("True");
        else
            System.out.println("false");


    }

    public static boolean isArmstrongno(int no){

        String num=Integer.toString(no);
        int len=num.length();
        int sum=0;
        for (char c:num.toCharArray())
        {
            sum=sum+(int)(Math.pow((int)c,len));
        }
        return no==sum?true:false;

    }

}
