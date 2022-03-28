package ARRAY2D.java;
import PreClassAssignment.QuickSort;

import java.util.Arrays;
// linear seacg
public class MatrixMultiplication {
    public  static void main(String args[]) {
        int arr[]={9,0,6,3,4,8,8,4,4,6};
        quickSort (arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort (int arr[], int low, int high){
       if(low<high){
          int privotIndex=partition(arr,low,high);
           quickSort(arr,low,privotIndex-1);
           quickSort(arr,privotIndex+1,high);
       }
    }
    public static int partition(int arr[], int low ,int high){
         int i=low;
         int j=high;
         int pivotVal=arr[low];
         while (i<j){
             while(i<=high&& pivotVal>=arr[i])
                 i++;
             while(j>=0 && pivotVal<arr[j])
                 j--;
             if(i<j)
                 swap(arr,i,j);
         }
         swap(arr,low,j);
         return j;
    }
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
