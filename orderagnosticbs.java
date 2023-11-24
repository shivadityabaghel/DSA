package searchalgos;

public class orderagnosticbs {
    public static void main(String[] args) {
    int[] arr= {99,32,31,29,28,20,19,12,11,10,9,7,4,3,2,1,-1,-2,-3};
    int target= -2;
    int result= binsearch(arr, target);
    System.out.println(result);
    }

    static int binsearch(int[] arr, int target) {
        int start = 0;
        int end= arr.length-1;
        boolean isAsc= arr[end]>arr[start];

        while(start<=end){
         int mid= start + (end-start)/2;
         if(arr[mid] == target){
            return mid;
         }
         if (isAsc){
           if(target>arr[mid]){
            start= mid+1;
           }else{
            end= mid-1;
           }
        } else{
           if(target>arr[mid]){
            end= mid-1;
           }else {
            start= mid+1;;
           }
        }
    }
            return -1;
    

}
}    

        


