package Practices.JavaPrac;

public class Movezerotoendarrayint {
    public static void main(String[] args) {

        int []arr = {4,6,0,0,3,2,0};
        int arrsize = arr.length;

        System.out.println("Current array- ");
        //print current array
        for (int i = 0; i < arrsize;i++)
        {
            System.out.print(arr[i]+", ");
        }
        //create tep array with same size
        int []temp = new int[arrsize];
        int j=0;
        // get non zeros first to the array
        for (int i=0; i<arrsize;i++) {
            if (arr[i] != 0)
                temp[j++]=arr[i];
        }
        //
        while (j<arrsize)
        {
            temp[j++]=0;
        }
        //copy whole temp array to arr
        for (int i = 0; i<arrsize ; i++){
            arr[i]=temp[i];
        }

        System.out.println("\nMove zeros to the end- ");
        //print final array
        for (int i = 0; i < arrsize ; i++)
        {
            System.out.print(arr[i]+", ");
        }


    }
}
