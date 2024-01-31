class RecentCounter {
    List<Integer> requests = new ArrayList<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        requests.add(t);
        int count = 0;

        for(var request : requests) {
            if(request >= t - 3000 && request <= t) {
                count++;
            }
        } 

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */