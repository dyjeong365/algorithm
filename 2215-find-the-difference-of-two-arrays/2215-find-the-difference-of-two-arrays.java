import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }
    
    private List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(var num2 : nums2) {
            set2.add(num2);
        }
        
        for(var num1 : nums1) {
            if(!set2.contains(num1)) {
                set1.add(num1);
            }
        }
        
        return new ArrayList<>(set1);
    }
}