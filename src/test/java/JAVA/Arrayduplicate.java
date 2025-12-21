package JAVA;

import java.util.Scanner;

public class Arrayduplicate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int len = scan.nextInt();

        int []arr=new int[len];

        System.out.println("Enter array elements:");
        for( int i=0; i<len; i++){
            arr[i]=scan.nextInt();
        }
        arrayduplicte(arr);

    }
    public  static void arrayduplicte(int arr[]){
        int len=arr.length;
        System.out.println("Duplicate elements:");
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                break;
                }
            }

        }

    }
}
