class Solution {
    public int similarPairs(String[] words) {
        final int LEN = words.length;
        int res = 0;

        for (int i = 0; i < LEN - 1; i++) {
            String one = words[i];

            for (int j = i + 1; j < LEN; j++) {
                String theOther = words[j];
                boolean flag = true;

                for (int k = 0; k < theOther.length(); k++) {
                    if (!one.contains(String.valueOf(theOther.charAt(k)))) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    for (int l = 0; l < one.length(); l++) {
                        if (!theOther.contains(String.valueOf(one.charAt(l)))) {
                            flag = false;
                            break;
                        }
                    }
                }

                if (flag) {
                    res++;
                }
            }
        }

        return res;
    }
}