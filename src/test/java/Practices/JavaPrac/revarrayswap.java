package Practices.JavaPrac;

public class revarrayswap {
    public static void main(String[] args) {

        int arr[] = {3,2,0,5,6,5,3};
        int count = arr.length;
        System.out.println("Actual array -  ");
        //print array
        for (int i = 0; i < count; i++){
            System.out.print(arr[i]+", ");
        }
        //first and last
        int first=0, last=count-1;
        for (int i = 0; i < count/2; i++)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.println("\nRevesre array -  ");
        //print array
        for (int i = 0; i < count; i++){
            System.out.print(arr[i]+", ");
        }


    }
}
