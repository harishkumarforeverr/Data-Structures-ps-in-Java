package ARRAY2D.java;
import java.util.Arrays;
// linear seacg
public class MatrixMultiplication {
    public  static void main(String args[]) {
        int arr[]={9,0,6,3,4,8,4,4,6};
        mergeSort (arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort (int arr[], int low, int high){
       if(low<high){
           int mid=(low+high)/2;
           mergeSort(arr,low,mid);
           mergeSort(arr,mid+1,high);
           merge(arr,low,mid,high);
       }
    }
    public static void  merge(int arr[], int low, int mid, int high){
          int i=low,j=mid+1;
          int temp[]=new int[arr.length];
          int k=low;
          while (i<=mid && j<=high){
              if(arr[i]<arr[j]){
                  temp[k]=arr[i];
                  i++;
              }
              else{
                  temp[k]=arr[j];
                  j++;
              }
              k++;
          }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }
       for(int z=low;z<=high;z++){
           arr[z]=temp[z];
       }
    }
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}






// 2ND METH
public static int[] implementMergeSort(int arr[], int low, int high)
    {
        if (low < high) // atleast we have two elements in array
        {
            int mid = (low + high) / 2;
            implementMergeSort(arr, low, mid);
            implementMergeSort(arr, mid + 1, high);
            merge(arr, mid, low, high);
        }
        return arr;
    }
 public static void merge(int[] arr, int mid, int low, int high) {
       int temp[]=new int[high-low+1];
       int i=low;
       int j=mid+1;
       int k=0;
       while (i<=mid && j<=high){
           if(arr[i]<arr[j]){
               temp[k]=arr[i]; i++;
           }else{
               temp[k]=arr[j]; j++;
           }
           k++;
       }
       while (i<=mid){
           temp[k]=arr[i]; i++; k++;
       }
       while (j<=high){
           temp[k]=arr[j]; j++; k++;
       }
       k=0;
       for (int z=low;z<=high;z++){
           arr[z]=temp[k]; k++;
        }
    }
