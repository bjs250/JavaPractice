class MyHashSet {

    private int largePrime = 15485867;
    private Integer[] set = new Integer[15485867];

    /** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        set[key] = key % largePrime;
    }
    
    public void remove(int key) {
        set[key] = null;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if (set[key] != null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        System.out.println(obj.contains(1));
        System.out.println(obj.contains(2));
        obj.add(2);
        System.out.println(obj.contains(2));
        obj.remove(2);
        System.out.println(obj.contains(2));
        
    }

}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */