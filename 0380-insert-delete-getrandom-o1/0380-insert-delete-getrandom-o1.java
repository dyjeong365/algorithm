class RandomizedSet {
    Set<Integer> set;
    List<Integer> list;

    public RandomizedSet() {
        set = new HashSet<>();
        list = new LinkedList<>();
    }

    public boolean insert(int val) {
        if (set.contains(val))
            return false;
        else {
            set.add(val);
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!set.contains(val))
            return false;
        else {
            set.remove(val);
            list.remove(list.indexOf(val));
            return true;
        }
    }

    public int getRandom() {
        int random = (int) (Math.random() * list.size());

        return list.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */