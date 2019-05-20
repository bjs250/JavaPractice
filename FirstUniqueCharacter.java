import java.util.*;

class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (map.containsKey(s.charAt(i)) == false )
            {
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }

        for (int i =0; i < s.length(); i++)
        {
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args)
    {
        FirstUniqueCharacter solution = new FirstUniqueCharacter();
        // String s = "leetcode";
        // int result = solution.firstUniqChar(s);
        // System.out.printf("Answer: %s, Got: %s",0,result);

        String s = "loveleetcode";
        int result = solution.firstUniqChar(s);
        System.out.printf("Answer: %s, Got: %s",2,result);


    }
}