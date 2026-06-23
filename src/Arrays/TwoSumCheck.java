package Arrays;

import java.util.HashSet;

public class TwoSumCheck {
   public boolean hasTwoSum(int []arr,int target){
       HashSet set = new HashSet<>();
       for(int num: arr){
           int complement = target-num;
           if(set.contains(complement)){
               return true;
           }
           set.add(num);
       }
       return false;
   }
    public static void main(String[] args) {
        TwoSumCheck obj = new TwoSumCheck();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        boolean result = obj.hasTwoSum(nums, target);

        System.out.println(result ? "Yes" : "No");
    }
}
