class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 첫번째 문자 추출
        char c  = s.charAt(0);
        // 처음 나온 문자의 갯수
        int cnt1 = 0;
        // 처음 나온 문자와 다른 갯수
        int cnt2 = 0;
        
        for(int i = 0; i < s.length(); i++){
            // 문제의 첫번째 요건 : 처음나온 문자의 갯수와 처음나온 문자가 아닌 문자의 갯수가 동일할 때
            // 문자열을 분리하기 때문에 answer 를 증가 시켜준 후 c 즉, 첫번째 문자를 저장한다.
            if(cnt1 == cnt2){
                answer++;
                c = s.charAt(i);
            }
            
            // 추출한 첫번째 문자와 동일할 경우 idx 를 증가
            // 첫번째 문자가 아닐 경우 jdx 증가
            if (s.charAt(i) == c){
                cnt1++;
            } else {
                cnt2++;
            }   
        }
        return answer;
    }
}