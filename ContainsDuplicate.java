// https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1112/

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0){
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            System.out.println(i);
            if (set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String args[]){
        ContainsDuplicate s = new ContainsDuplicate();
        int[] a = {1,2,3,1};
        int[] b = {1,2,3,4};
        int[] c = {1,1,1,3,3,4,3,2,4,2};
        assert s.containsDuplicate(a) == true;
        assert s.containsDuplicate(b) == false;
        assert s.containsDuplicate(c) == true;     
        int[] d = {};
        int[] e = {0};
        assert s.containsDuplicate(d) == false;
        assert s.containsDuplicate(e) == false;
        
    }
}