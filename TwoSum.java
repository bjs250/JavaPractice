import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(target-nums[i]) && i != map.get(target-nums[i])){
                return new int[] {i, map.get(target-nums[i])};
            }
        }
        
        return null;
    }

    public static void main(String args[]){
        //int[] nums = {2,7,11,15};
        //int target = 9;
        int[] nums = {3,2,4};
        int target = 6;
        
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);
        System.out.printf("Expected: [0,1], got: %s",Arrays.toString(result));

    }
}