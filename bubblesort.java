package searchalgos;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
    int[] arr= {2,9,10,18,41};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<= arr.length-1; i++){
            swapped= false;
            for(int j=0; j< arr.length-1-i; j++){
                   if(arr[j]>= arr[j+1]){
                swap(arr, j, j+1);
                swapped = true;
            }
        
            }
            if (swapped=true){
            break;
        }
        }
        

    }
     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
       arr[first] = arr[second];
        arr[second]= temp;
    }
    

}
