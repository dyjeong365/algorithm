class SmallestInfiniteSet {
    PriorityQueue<Integer> priorityQueue;

    public SmallestInfiniteSet() {
        priorityQueue = new PriorityQueue<>();

        for (int i = 1; i <= 1000; i++) {
            priorityQueue.offer(i);
        }
    }

    public int popSmallest() {
        return priorityQueue.poll();
    }

    public void addBack(int num) {
        if (!priorityQueue.contains(num)) {
            priorityQueue.offer(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */