package searchalgos;

public class rbs {
     public static void main(String[] args) {
     int[] arr= {3,5,1};   
     int target= 1;
     System.out.println(search(arr, target));
    }
static int search(int[] arr, int target){
int pivot = findpivot(arr);
if(pivot == -1){
    return binarysearch(arr, target, 0, arr.length-1);
}else if(arr[pivot] == target){
    return pivot;
}else if(target>=arr[0]){
    return binarysearch(arr, target, 0, pivot);
}else {
    return binarysearch(arr, target, pivot+1, arr.length-1);
}

}


static int binarysearch(int[] arr, int target, int start, int end){
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
static int findduplicatespivot(int[] arr){
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
        else if(arr[start]==arr[mid] && arr[mid]==arr[end]){
            if(arr[start]>arr[start+1]){
                return start;
            }
            start++;
            if(arr[end]<arr[end+1]){
                return end +1;
            }
            end++;
        }
         // left side is sorted, so pivot should be in right
         else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        
    }
        return -1;
}
}
