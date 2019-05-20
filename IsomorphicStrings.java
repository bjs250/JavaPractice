import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,ArrayList<Integer>> S = new HashMap<>();
        for (int i = 0; i < s.length(); i ++)
        {
            if (S.containsKey(s.charAt(i)) == false){
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                S.put(s.charAt(i), temp);
            }
            else{
                ArrayList<Integer> temp = S.get(s.charAt(i));
                temp.add(i);
                S.put(s.charAt(i), temp );
            }
        }
        Map<Character,ArrayList<Integer>> T = new HashMap<>();
        for (int i = 0; i < t.length(); i ++)
        {
            if (T.containsKey(t.charAt(i)) == false){
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                T.put(t.charAt(i), temp);
            }
            else{
                ArrayList<Integer> temp = T.get(t.charAt(i));
                temp.add(i);
                T.put(t.charAt(i), temp );
            }
        }
        System.out.printf("%s \n",S.toString());
        System.out.printf("%s \n",T.toString());

        for (int i = 0; i < s.length(); i ++)
        {
            if (S.get(s.charAt(i)).equals(T.get(t.charAt(i))) == false ){
                return false;
            }
        }

        return true;
 
    }

    public static void main(String args[]){
        IsomorphicStrings solution = new IsomorphicStrings();
        
        //1
        // String s = "egg";
        // String t = "add";
        // boolean result = solution.isIsomorphic(s, t);
        // System.out.printf("Expected answer: %s, Answer: %s",true,result);

        // 2
        // String s = "foo";
        // String t = "bar";
        // boolean result = solution.isIsomorphic(s, t);
        // System.out.printf("Expected answer: %s, Answer: %s",false,result);

        // 3
        // String s = "paper";
        // String t = "title";
        // boolean result = solution.isIsomorphic(s, t);
        // System.out.printf("Expected answer: %s, Answer: %s",true,result);

        // 4
        // String s = "aba";
        // String t = "baa";
        // boolean result = solution.isIsomorphic(s, t);
        // System.out.printf("Expected answer: %s, Answer: %s",false,result);

        // 5
        // String s = "abba";
        // String t = "abab";
        // boolean result = solution.isIsomorphic(s, t);
        // System.out.printf("Expected answer: %s, Answer: %s",false,result);
    }
}