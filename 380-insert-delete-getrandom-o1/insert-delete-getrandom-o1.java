import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
class RandomizedSet {
    private Map<Integer, Integer> valueToIndexMap = new HashMap<>();
    private List<Integer> valuesList = new ArrayList<>(); 
    private Random randomGenerator = new Random(); 
    public RandomizedSet() {
    }
    public boolean insert(int val) {
        if (valueToIndexMap.containsKey(val)) {
            return false;
        }
        valueToIndexMap.put(val, valuesList.size()); 
        valuesList.add(val); 
        return true;
    }
    public boolean remove(int val) {
        if (!valueToIndexMap.containsKey(val)) {
            return false;
        }
        int indexToRemove = valueToIndexMap.get(val); 
        int lastElement = valuesList.get(valuesList.size() - 1); 
        valuesList.set(indexToRemove, lastElement);
        valueToIndexMap.put(lastElement, indexToRemove); 
        valuesList.remove(valuesList.size() - 1); 
        valueToIndexMap.remove(val);
        return true;
    }
    public int getRandom() {
        return valuesList.get(randomGenerator.nextInt(valuesList.size())); 
    }
}
