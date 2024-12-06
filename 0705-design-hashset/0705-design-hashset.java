class MyHashSet {
    List<String> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (!list.contains(String.valueOf(key))) {
            list.add(String.valueOf(key));
        }
    }

    public void remove(int key) {
        if (list.contains(String.valueOf(key))) {
            list.remove(String.valueOf(key));
        }
    }

    public boolean contains(int key) {
        return list.contains(String.valueOf(key));
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */