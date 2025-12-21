package Practices.JavaPrac;


import java.util.Scanner;

public class Arrayasc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = scanner.nextInt();
        int []arr = new int[len];
        System.out.println("Enter array :");
        for (int i = 0; i < len; i++ )
            arr[i] = scanner.nextInt();

        int []asc = ascarray(arr);

        System.out.println("Ascending array :");
        for(int num : arr){
            System.out.print(num+", ");
        }

    }
    public static int[] ascarray(int []arr){
        int len=arr.length;
        for(int i = 0; i<len; i++)
            for(int j = i + 1; j < len; j++)
            {
                if (arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        return arr;
    }
}
