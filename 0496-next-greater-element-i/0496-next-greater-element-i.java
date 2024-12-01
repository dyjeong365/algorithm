class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int idx = 0;

        /*
         * 1. 같은 수를 찾는다.
         * 2. 그 수를 기준으로 오른쪽으로 더 큰 수를 찾는다 (num2.length 까지)
         * 3. 발견하지 못하면 -1 반환
         * 4. ans 의 idx++;
         */
        for (var num1 : nums1) {
            for (int i = 0; i < nums2.length; i++) {
                if (num1 == nums2[i]) {
                    int j = i + 1;

                    while (j < nums2.length) {
                        if (num1 < nums2[j]) {
                            ans[idx] = nums2[j];
                            break;
                        }

                        else {
                            j++;
                        }
                    }

                    if (ans[idx] == 0) {
                        ans[idx] = -1;
                    }

                    idx++;
                }
            }
        }

        return ans;
    }
}