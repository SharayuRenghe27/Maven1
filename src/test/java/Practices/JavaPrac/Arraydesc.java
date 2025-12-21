package Practices.JavaPrac;

import java.util.Scanner;

public class Arraydesc {
    public static void main(String args[]){

        System.out.println("Enter size of array: ");
        Scanner scan=new Scanner(System.in);
        int len=scan.nextInt();

        System.out.println("Enter array :");
        int []arr=new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = scan.nextInt();
        }

       descarray(arr);

        for (int num : arr)
            System.out.print(num+", ");
    }
    public static int[] descarray(int []arr){
        int len=arr.length;
        for(int i = 0; i<len; i++) {
            for (int j = i+1; j<len ; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

}
