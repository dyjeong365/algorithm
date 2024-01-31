class RecentCounter {
    Queue<Integer> requests = new LinkedList<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        requests.offer(t);
        Integer min = t - 3000;
        
        while(!requests.isEmpty() && requests.peek() < min) {
            requests.poll();
        }
        
        return requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */