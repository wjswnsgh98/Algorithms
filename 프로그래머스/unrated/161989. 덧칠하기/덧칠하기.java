class Solution {
    // 처음과 끝을 정하고 그 사이에 값이 없으면 새로 처음과 끝을 설정한 후 페인트 횟수 1 증가
    public int solution(int n, int m, int[] section) {
        int s = section[0];
        int e = section[0] + (m - 1);
        int answer = 1;
        
        for(int i : section){
            if(s <= i && i <= e){
                continue;
            } else {
                s = i;
                e = i + (m - 1);
                answer++;
            }
        }
        return answer;
    }
}