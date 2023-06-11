class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] splitedS = s.toCharArray();
        
        for(char alphabet : splitedS){
            int caesar = alphabet + n;
            
            if(alphabet == ' '){
                sb.append(" ");
                continue;
            }
            // 소문자: 97 ~ 122
            else if(Character.isLowerCase(alphabet) && caesar > 122){
                caesar = caesar % 123 + 97;
            }
            // 대문자: 65 ~ 90
            else if(Character.isUpperCase(alphabet) && caesar > 90){
                caesar = caesar % 91 + 65;
            }
            sb.append((char)caesar);
        }
        return sb.toString();
    }
}