class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer1 = 2*a*b;
        if(answer>answer1){
            return answer;
        }
        else{
            return answer1;
        }
    }
}