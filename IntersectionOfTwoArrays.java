// https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1105/
import java.util.*;

class IntersectionOfTwoArrays {
    

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();        
        Set<Integer> set2 = new HashSet<>();        
       
        for (int num: nums1){
            set1.add(num);
        }

        for (int num: nums2){
            if (set1.contains(num))
            {
                set2.add(num);
            }
        }

        int[] ans = new int[set2.size()];
        int i = 0;
        for(int num: set2){
            ans[i] = num;
            i += 1;
        }
        
        return ans;
    }

    public static void main(String args[]){
        IntersectionOfTwoArrays s = new IntersectionOfTwoArrays();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = s.intersection(nums1, nums2);
        for (int i: ans){
            System.out.println(i);
        }
    }


}