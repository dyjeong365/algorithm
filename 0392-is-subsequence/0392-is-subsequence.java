class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(s.split("")));
    
        for(var el : t.split("")) {
            if(queue.isEmpty()) {
                break;
            }
            
            if (queue.peek().equals(el)) {
                queue.poll();
            }
        }
        
        return s.isEmpty() || queue.isEmpty();
    }
}