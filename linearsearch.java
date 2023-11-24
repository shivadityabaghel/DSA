package searchalgos;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= {1,2,4,6,2,3,18,19,20,21,22};
        System.out.println("Enter a number");
        int target= in.nextInt();
        int result= linsearch(arr, target);
        System.out.println(result);

     }
    static int linsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index=0; index<arr.length; index++){
            int element= arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;


    }
}
