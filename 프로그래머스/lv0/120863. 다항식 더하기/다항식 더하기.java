class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int coefficient = 0, constant = 0;
        String[] splitedPolynomial = polynomial.split(" ");
        
        for(int i=0; i<splitedPolynomial.length; i++){
            String each = splitedPolynomial[i];
            
            if(!each.contains("x") && !each.contains("+")){
                constant += Integer.parseInt(each);
            }
            
            if(each.contains("x")){    
                coefficient += (each.length() == 1) ? 1 : Integer.parseInt(each.substring(0, each.length()-1));
            }
        }
        
        if(coefficient > 1){
            answer.append(String.valueOf(coefficient));
        }
        
        if(coefficient > 0){
            answer.append("x");
            if(constant > 0){
                answer.append(" + ");
            }
        }
        
        if(constant > 0){
            answer.append(String.valueOf(constant));
        }
        
        return answer.toString();
    }
}