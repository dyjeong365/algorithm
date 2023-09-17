import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int sizeOfUnion = 0;
        List<String> intersection = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        for(int i=0; i<str1.length(); i++){
            int end = i+2;
            if(end > str1.length()) break;
            boolean flag = true;
            String element = str1.substring(i, end);
            
            for(var el : element.toCharArray()){
                if(!Character.isAlphabetic(el)){
                    flag = false;
                    break;
                }
            }
            
            if(flag) list1.add(element);
        }
        
        for(int i=0; i<str2.length(); i++){
            int end = i+2;
            if(end > str2.length()) break;
            boolean flag = true;
            String element = str2.substring(i, end);
            
            for(var el : element.toCharArray()){
                if(!Character.isAlphabetic(el)){
                    flag = false;
                    break;
                }
            }
            
            if(flag) list2.add(element);
        }
        
        for(int i=0; i<list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i).equals(list2.get(j))){
                    intersection.add(list1.get(i));
                    list2.remove(list2.get(j));
                    break;
                }
            }
        }
        
        sizeOfUnion = list1.size() + list2.size();
        answer = sizeOfUnion == 0 
            ? 65536 
            : (int)(((double)intersection.size() / sizeOfUnion) * 65536);
        
        return answer;
    }
}