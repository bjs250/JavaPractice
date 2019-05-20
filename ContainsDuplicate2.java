import java.util.*;

class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int index = 0; index < nums.length; index++){
            int j = 1;
            while (index + j < nums.length && j <= k)
            {
                //System.out.printf("%s,%s,%s,%s\n",nums[index],nums[index+j],index,j);
                if (nums[index] == nums[index+j]){
                    return true;
                }
                j++;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        ContainsDuplicate2 solution = new ContainsDuplicate2();
        // int[] nums = {1,2,3,1};
        // int k = 3;
        // boolean result = solution.containsNearbyDuplicate(nums, k);
        // System.out.printf("Answer: %s, Got: %s \n",true,result);

        // int[] nums = {1,0,1,1};
        // int k = 1;
        // boolean result = solution.containsNearbyDuplicate(nums, k);
        // System.out.printf("Answer: %s, Got: %s \n",true,result);

        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean result = solution.containsNearbyDuplicate(nums, k);
        System.out.printf("Answer: %s, Got: %s \n",false,result);

    }
}