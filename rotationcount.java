package searchalgos;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class rotationcount {
    public static void main(String[] args) {
        int[] arr= {7,8,9,10,11,12,13,14,0,1,2,3,4,5,6};
        System.out.println(countrotations(arr));
    }
    static int countrotations(int[] arr){
        int pivot= findpivot(arr);
        return pivot+1;
    }
    static int findpivot(int[] arr){
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
        int mid = start + (end-start)/2;
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        else if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid-1;
        }
        else if(arr[start]>=arr[mid]){
            end = mid-1;
        }
        else{
            start= mid+1;
        }
        
    }
        return -1;
}
}
