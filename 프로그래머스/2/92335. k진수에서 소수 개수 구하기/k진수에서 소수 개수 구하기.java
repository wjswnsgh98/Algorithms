class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Long.toString(n, k);
        String[] str = s.split("0");

        for(String st : str){
            if (st.isEmpty() || st.isBlank()) continue;
            
            if (isPrime(Long.parseLong(st))) answer++;
        }
        return answer;
    }
    
    // 소수 판별 메서드
    private boolean isPrime(Long num) {
        if (num == 1) return false;
        if (num == 2) return true;
        
    	// 2부터 num의 제곱근까지 반복
        for (int i = 2; i <= Math.sqrt(num); i++) {
        	// num이 i로 나눈 나머지가 0이면 소수가 아님
            if (num % i == 0) return false;
        }
        
        // 반복문을 무사히 마치면 소수
        return true;
    }
}