class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 1;
        for(int i = 1; i <= 10; i++){
            result *= i;
            if(result <= n){
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
}