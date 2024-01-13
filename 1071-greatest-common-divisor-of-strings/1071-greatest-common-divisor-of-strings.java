class Solution {
    public String gcdOfStrings(String str1, String str2) {
        for (int i = Integer.min(str1.length(), str2.length()); i >= 1; i--){
            if(valid(str1, str2, i)){
                return str1.substring(0, i);
            }
        }
             return "";
    }
    
    private static boolean valid(String str1, String str2, int k){
        if (str1.length() % k > 0 || str2.length() % k > 0) {
            return false;
        } else {
            String base = str1.substring(0, k);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
    }
}