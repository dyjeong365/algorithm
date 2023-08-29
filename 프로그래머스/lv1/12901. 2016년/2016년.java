class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        switch(a){
            case 2:
            case 8:
                answer = day[calDay(b, -1)];
                break;
            case 3:
            case 11:
                answer = day[calDay(b, 0)];
                break;
            case 6:
                answer = day[calDay(b, 1)];
                break;
            case 9:
            case 12:
                answer = day[calDay(b, 2)];
                break;
            case 1:
            case 4:
            case 7:
                answer = day[calDay(b, 3)];
                break;
            case 10:
                answer = day[calDay(b, 4)];
                break;
            case 5:
                answer = day[calDay(b, 5)];
                break;
        }
        return answer;
    }
    
    private static int calDay (int b, int num){
        return (b + num) % 7;
    }
}