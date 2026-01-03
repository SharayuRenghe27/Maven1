package JAVA;

public class MissingNoInArray {
    public static void main(String[] args) {
        int arr[]={7,3,2,1,5,6,9};
        int arrsize=arr.length;
        boolean found=false;
        System.out.println("Missing no - ");
        for (int i = 1; i < arrsize; i++){
             found=false;
            for (int j = 0; j < arrsize-1; j++){
                if (arr[j]==i)
                {
                    found=true;
                    break;
                }
            }
            if (!found)
            {
                System.out.print(i+", ");
            }
        }
//        if(found)
//            System.out.println("All No's are present");


    }
}
