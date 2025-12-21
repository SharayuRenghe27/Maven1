package JAVA;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
//        int []arr={1,4,5,7,9};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int len = scanner.nextInt();
        int []arr = new int[len];
        for (int i = 0; i<len; i++)
        {
             arr[i]   = scanner.nextInt();
        }
        int rev[]=revarray(arr);
        for (int i = 0; i<len; i++)
        {
            System.out.print(rev[i]+", ");
        }
    }

    public static int[] revarray(int []arr){
    int left = 0;
    int right = arr.length-1;
    while (left < right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
        return arr;

    }



}
