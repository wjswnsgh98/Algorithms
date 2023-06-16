class Solution {
    public int[] solution(int n) {
        int length = 0;
        if(n % 2 ==0){
            length = n / 2;
        }
        else{
            length = n / 2 + 1;
        }
        int[] answer = new int[length];
        int index = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                answer[index++] = i;
            }
        }
        return answer;
    }
}