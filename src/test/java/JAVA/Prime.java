package JAVA;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        System.out.println("Enter no");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();

        if (isPrime(no))
            System.out.println("Prime no-" + no);
        else
            System.out.println("Not prime no-" + no);

    }

    public static boolean isPrime(int no) {

        boolean prime = true;

        if (no <= 1)
            return  false;
        if (no == 2)
            return  true;
        if (no % 2 == 0)
            return  false;
        for (int i = 3; i * i <= no; i += 2) {
            if (no % i == 0)
                return  false;

        }
        return true;

    }
}
