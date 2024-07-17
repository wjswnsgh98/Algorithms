class Solution {
    public int solution(int storey) {
        int answer = 0;
        while(storey > 0){
            int r = storey % 10;
            storey /= 10;
            
            if(r > 5){
                answer += (10 - r);
                storey++;
            } else if(r < 5) {
                answer += r;
            }
            // 나머지가 5일 때 앞자리 수가 5 이상일 경우 앞자리에서 최솟값이 감소한다.
            else if(storey % 10 >= 5){
                answer += 5;
                storey++;
            } else {
                answer += 5;
            }
        }
        return answer;
    }
}