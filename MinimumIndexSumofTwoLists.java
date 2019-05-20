import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (int i = 0; i < list1.length; i++)
        {
            map.put(list1[i],i);
        }
        System.out.printf("%s \n",map.toString());

        Map<String,Integer> ans = new HashMap<String,Integer>();

        for (int i = 0; i < list2.length; i++)
        {
            if (map.containsKey(list2[i])){
                //System.out.printf("get %s,%s,%s \n",list2[i],map.get(list2[i]),i);
                ans.put(list2[i], map.get(list2[i])+i);
            }
        }

        System.out.printf("%s \n",ans.toString());
        int minIndex = 10000;
        int minValue = 10000;
        String minKey = null;

        ArrayList<String> result = new ArrayList<String>();

        for (Map.Entry<String,Integer> entry: ans.entrySet()){
            if (entry.getValue() < minValue){
                minValue = entry.getValue();
                minKey = entry.getKey();
                result.clear();
                result.add(minKey);
            }
            else if (entry.getValue() == minValue){
                result.add(entry.getKey());
            }
        }
        
        System.out.println(result.toString());
        return result.toArray(new String[0]);
        
    }
    public static void main(String args[]){
        MinimumIndexSumofTwoLists solution = new MinimumIndexSumofTwoLists();
        // String[] str1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        // String[] str2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        // String[] result = solution.findRestaurant(str1, str2);
        // System.out.printf("Answer: Shogun, Got: %s",result.toString());

        // String[] str1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        // String[] str2 = {"KFC", "Shogun", "Burger King"};
        // String[] result = solution.findRestaurant(str1, str2);
        // System.out.printf("Answer: Shogun, Got: %s",result.toString());

        String[] str1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] str2 = {"KFC","Burger King","Tapioca Express","Shogun"};
        String[] result = solution.findRestaurant(str1, str2);
        System.out.printf("Answer: Shogun, Got: %s",result.toString());
        
    }
}

