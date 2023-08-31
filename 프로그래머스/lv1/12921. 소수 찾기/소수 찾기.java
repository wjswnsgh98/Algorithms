class Solution {
    // 에라토스테네스의 체
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            num[i] = i;
        }
        
        for(int i = 2; i < n + 1; i++){
            if(num[i] != 0){
                for(int j = i + i; j < n + 1; j += i){
                    num[j] = 0;
                }
            }
        }
        
        for(int i = 2; i < n + 1; i++){
            if(num[i] != 0){
                answer++;
            }
        }
        return answer;
    }
}