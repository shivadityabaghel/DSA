package searchalgos;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listofmissnumbers {
    public static void main(String[] args) {
        int[] nums={8,6,5,3,2,1,1,2};
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result);
    }
     public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i= 0; 
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        //find all the missing number
        List<Integer> ans= new ArrayList<>();
        for (int index= 0; index<nums.length; index++){
           int correct = index+1;
           if(nums[index] != correct){
                ans.add(correct);
            }
        }
        return ans;

    }
    static void swap(int[] nums, int i, int correct) {
        int temp= nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}

