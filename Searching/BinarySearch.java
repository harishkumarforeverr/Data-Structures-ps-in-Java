package ARRAY2D.java;
import PreClassAssignment.QuickSort;

import java.util.Arrays;
// linear seacg
public class MatrixMultiplication {
    public  static void main(String args[]) {
        int arr[]={9,0,6,3,4,8,8,4,4,6};
        if(BinarySearch (arr,0)){
            System.out.println("value found");
        }
        else{
            System.out.println("value not dound");
        }
    }
    public static boolean BinarySearch (int arr[], int val){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid]==val)
                return true;
            if(arr[mid]>val)
                high=mid-1;
            else
                low=mid+1;
        }
        return  false;
    }
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
