package array_string;

import java.util.*;

/**
 * Implement the RandomizedSet class:
 * <p>
 * RandomizedSet() Initializes the RandomizedSet object.
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present,
 * false otherwise.
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false
 * otherwise.
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one
 * element exists when this method is called). Each element must have the same probability of being returned.
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 */
public class RandomizedSet380 {

    private List<Integer> list;
    private HashMap<Integer, Integer> set;
    private Random random;
    public RandomizedSet380() {
        list = new ArrayList<Integer>();
        set = new HashMap<Integer, Integer>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (set.containsKey(val)) {
            return false;
        }
        list.add(val);
        set.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!set.containsKey(val)) {
            return false;
        }
        Integer index = set.get(val);
        list.set(index, list.get(list.size() - 1));
        set.put(list.get(index), index);
        list.remove(list.size() - 1);
        set.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {

}
