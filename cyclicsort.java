package searchalgos;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr= {5,3,1,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i=0;
        while(i < arr.length-1){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int last) {
        int temp= arr[first];
        arr[first]= arr[last];
        arr[last]= temp;
        }
}
