package HashMaps.day26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Hashmap_impl {
    class RandomizedSet {
    public ArrayList<Integer> list;
    public HashMap<Integer, Integer> map;

    public RandomizedSet() {
        list= new ArrayList<>();
        map= new HashMap<>();
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index = map.get(val);
        list.set(index, list.get(list.size()-1));
        map.put(list.get(index), index);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
