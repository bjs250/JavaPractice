import java.util.*;

public class SingleNumber{
    
    public int singleNumber(int[] nums){
        
        Map<Integer,Integer> ht = new Hashtable();
        for (int i = 0; i < nums.length; i++){
            if (ht.containsKey(nums[i])){
                ht.put(nums[i],(int)ht.get(nums[i])+1);
            }
            else{
                ht.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: ht.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String args[]){
        SingleNumber s = new SingleNumber();
        int[] a = {2,2,1};
        int[] b = {4,1,2,1,2};
        assert s.singleNumber(a) == 1: "Test a incorrect, Expected: 1, Answer: " + s.singleNumber(a);
        assert s.singleNumber(b) == 4: "Test b incorrect, Expected: 4, Answer: " + s.singleNumber(b);
    }

}