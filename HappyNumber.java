// https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1131/

import java.util.*;

import javax.print.attribute.HashAttributeSet;

class HappyNumber {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        int i = 0;
        String s = null;
        int total = 0;
        while (i < 50)
        {
            
            s = Integer.toString(n);
            total = 0;
            for (int j = 0; j < s.length(); j++){
                total += (int)Math.pow(Character.getNumericValue(s.charAt(j)),2);
            }
            if (total == 1){
                return true;
            }

            if (set.contains(total)){
                return false;
            }
            else{
                set.add(total);
            }             
            n = total;

            i++;
        }
        
        return false;
    }

    public static void main(String args[])
    {
        HappyNumber s = new HappyNumber();
        System.out.printf("%s,%s \n", true,s.isHappy(19));

    }
}