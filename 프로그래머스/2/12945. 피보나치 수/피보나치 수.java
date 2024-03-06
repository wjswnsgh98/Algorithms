// Dynamic programming을 이용하여 중복연산과 불필요한 메모리 사용 줄이기
class Solution {
    public int solution(int n) {
        int answer = f(n);
        return answer;
    }
    
    public int f(int n){
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        
        for(int i = 2; i <= n; i++){
            // 범위가 100,000 이하이기 때문에 1234567로 나눈 나머지로 저장
            cache[i] = (cache[i - 1] + cache[i - 2]) % 1234567;
        }
        return cache[n] % 1234567;
    }
}