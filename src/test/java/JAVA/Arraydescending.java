package JAVA;

import java.util.Scanner;

public class Arraydescending {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int len = scanner.nextInt();
        int []array = new int[len];
        for (int i = 0; i<len; i++)
        {
            array[i]   = scanner.nextInt();
        }
        int ans[] = sortdescending(array);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
    public static int[] sortdescending(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (array[i] <array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
