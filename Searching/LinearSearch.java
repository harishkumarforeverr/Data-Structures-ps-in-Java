package ARRAY2D.java;
import PreClassAssignment.QuickSort;

import java.util.Arrays;
// linear seacg
public class MatrixMultiplication {
    public  static void main(String args[]) {
        int arr[]={9,0,6,3,4,8,8,4,4,6};
        if(LinearSearch (arr,10)){
            System.out.println("value found");
        }
        else{
            System.out.println("value not dound");
        }
    }
    public static boolean LinearSearch (int arr[], int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val)
                return  true;
        }
        return  false;
    }
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
