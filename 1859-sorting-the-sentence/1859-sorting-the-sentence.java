class Solution {
    public String sortSentence(String s) {
        String[] splitedS = s.split(" ");
        int len = splitedS.length;
        String[] res = new String[len];
        int i = 0;
        StringBuilder sb = new StringBuilder();

        for(var pos : splitedS){
            int end = pos.length()-1;
            i = pos.charAt(end) - '0';
            res[i-1] = pos.substring(0, end);
        }

        for(var pos : res){
            sb.append(pos)
            .append(" ");
        }

        return sb.toString().substring(0, sb.length() - 1);
    }
}