class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean result12 = false;
        boolean result34 = false;
        if(x1 == true || x2 == true){
            result12 = true;
        } 
        if(x3 == true || x4 == true){
            result34 = true;
        }
        if(result12 == false || result34 == false){
            answer = false;
        }
        return answer;
    }
}