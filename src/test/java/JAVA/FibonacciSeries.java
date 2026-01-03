package JAVA;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the no for fibonacci series");
        Scanner scanner=new Scanner(System.in);
        int no=scanner.nextInt();

        printFibonaciSeries(no);

    }

    private static void printFibonaciSeries(int no){

        int first=0, second=1, third=0;

        for(int i=1; i<=no; i++){

            System.out.println(first);
            third=first+second;
            first=second;
            second=third;

        }


    }
}
