class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            int r = n / i;
            if(n - (r * i + 1) == 0){
                answer = i;
                break;
            } else {
                continue;
            }
        }
        return answer;
    }
}