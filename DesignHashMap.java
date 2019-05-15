class MyHashMap {

    private Integer[] set = new Integer[1000000];

    /** Initialize your data structure here. */
    public MyHashMap() {
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        set[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if (set[key] != null){
            return set[key];
        }
        else{
            return -1;
        }
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if (set[key] == null){
            //do nothing
        }
        else{
            set[key] = null;
        }
    }

    public static void main(String args[]){
        MyHashMap obj = new MyHashMap();
        obj.put(1,5);
        int param_2 = obj.get(1);
        System.out.println(param_2);
        obj.remove(1);
        System.out.println(obj.get(1));
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */