class RandomizedSet {
    Map<Integer, Boolean> map;
    List<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        else {
            map.put(val, true);
            list.add(val);
            
            return true;
        }
    }

    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        else {
            map.remove(val);
            list.remove(list.indexOf(val));

            return true;
        }
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