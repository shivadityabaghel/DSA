package searchalgos;
//binary search for sorted arrays, sorted in ascending order
public class binarysearch {
    public static void main(String[] args) {
   int[] arr= {2,3,4,5,6,7,19,20,22,28,29,39};
   int target= 3;
   System.out.println(binsearch(arr, target));
    }

    static int binsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start= mid+1;
            }
            else if(target<arr[mid]){
                end= mid-1;
            }
            else{
                return mid;
            }


        }

        return -1;
    }
    

    
}
