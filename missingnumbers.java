package searchalgos;

class missingnumbers {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1,5,7,10,9,6,3};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// //   public int missingNumber(int[] nums) {
//           int i= 0;
//         while(i<nums.length){
//             int correct= nums[i];
//             if(nums[i]<nums.length && nums[i]!= nums[correct]){
//                 swap(nums, i , correct);
//             }else{
//                 i++;
//             }
//         }

//         for (int index= 0; index<nums.length; index++){
//             if ( nums[index]!= index){
//                 return index;
//             }
//         }
//          return nums.length;
        
//     }
//     void swap(int[] nums, int i, int j) {
//         int temp= i;
//         i=j;
//         j= temp;
//     }

//     }