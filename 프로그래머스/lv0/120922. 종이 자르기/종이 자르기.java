class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if(M > 1 && N > 1){
            answer = M * N - 1;
        } else if(M == 2 || N == 2){
            answer = 1;
        }
        return answer;
    }
}