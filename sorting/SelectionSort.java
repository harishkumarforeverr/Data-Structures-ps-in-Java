package ARRAY2D.java;
import PreClassAssignment.QuickSort;

import java.util.Arrays;
// linear seacg
public class MatrixMultiplication {
    public  static void main(String args[]) {
        int arr[]={9,0,6,3,4,8,8,4,4,6};
        SelectionSort (arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort (int arr[], int low, int high){
          for(int i=0;i<high-1;i++){
              int temp=arr[i];
              int minIndex=i;
              for(int j=i+1;j<high;j++){
                  if(arr[j]<temp){
                      temp=arr[j];
                      minIndex=j;
                  }
              }
              swap(arr,i,minIndex);
          }
    }
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
