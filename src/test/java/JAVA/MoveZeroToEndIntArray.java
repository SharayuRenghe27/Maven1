package JAVA;

public class MoveZeroToEndIntArray {
    public static void main(String[] args) {

        int []array1={1,9,0,2,0,3,0,4};
        int []temp=new int[array1.length];//create temp array
        int notzeronum=0;
        System.out.println(" Current input-  ");

        //print current array
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+", ");
        }
        // if not zero copy no
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]!=0)
                temp[notzeronum++]=array1[i];
        }
        //remining add zero
        while (notzeronum<array1.length)
        {
            temp[notzeronum++]=0;
        }
        //copy temp array to array1
        for(int i=0;i<array1.length;i++){
            array1[i]=temp[i];
        }
        System.out.println("\n Final output-  ");
        //print array
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+", ");
        }





}

}
