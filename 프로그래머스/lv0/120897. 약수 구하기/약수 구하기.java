class Solution {
    public int[] solution(int n) {
        int size = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                size++;
            }
        }
        int index = 0;
        int[] answer = new int[size];
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[index++] = i;
            }
        }
        return answer;
    }
}