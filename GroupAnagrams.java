import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Map<Character,Integer>> counterHolder = new HashMap<>();
        for (String str: strs){
            Map<Character,Integer> map = new HashMap<>();
            for(Character c: str.toCharArray()){
                if (map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }
                else{
                    map.put(c,1);
                }
                counterHolder.put(str,map);
            }
        }

        // List<List<String>> ans = new List<>();
        Map<Map<Character,Integer>,List<String>> counterMap = new HashMap<>();

        for (Map.Entry<String,Map<Character,Integer>> entry: counterHolder.entrySet()){
            System.out.println(entry);
            if (counterHolder.containsKey(entry.getValue())){
                System.out.println("found");
                counterMap.get(entry.getValue()).add(entry.getKey());
            }
            else{
                System.out.println("not found");
                List<String> L = new ArrayList<>();
                L.add(entry.getKey());
                counterMap.put(entry.getValue(),L);
            }
        }

        System.out.println(counterMap);
        
        return null;
    }

    public static void main(String args[]){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams solution = new GroupAnagrams();
        solution.groupAnagrams(strs);
    }
}