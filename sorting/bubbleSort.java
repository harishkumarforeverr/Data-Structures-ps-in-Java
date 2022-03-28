package ARRAY2D.java; 
import java.util.Arrays;
// linear seacg
public class MatrixMultiplication {
    public  static void main(String args[]) {
        int arr[]={9,0,6,3,4,8,4,4,6};
        BubbleSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSort(int arr[], int low, int high){
        boolean bool=false;
      for (int outer=0;outer<high;outer++){
          bool=true;
          for(int i=low;i<high-1;i++){
              if(arr[i]>arr[i+1])
              {
                  bool=false;
                  swap(arr,i,(i+1));
              }
          }
          if(bool){
              break;
          }
          System.out.println(outer);
      }
    }
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
