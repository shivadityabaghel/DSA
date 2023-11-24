package searchalgos;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    // static void selectionsort(int[] arr) {
    //    for(int i=0; i< arr.length; i++){
    //     int last= arr.length-i-1;
    //     int max = getMaxindex(arr, 0, last);
    //     swap(arr, max, last);
    //    }
    // }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }


   static void swap(int[] arr, int first, int last) {
    int temp= arr[first];
    arr[first]= arr[last];
    arr[last]= temp;
    }

//   static int getMaxindex(int[] arr, int start, int end) {
//         int max = start;
//         for (int i = start; i <= end; i++) {
//             if (arr[max] < arr[i]) {
//                 max = i;
//             }
//         }
//         return max;
//     }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
