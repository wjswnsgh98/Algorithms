class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int result = 1;
        for(int i = 0; i < box.length; i++){
            answer = box[i] / n;
            result *= answer;
        }
        return result;
    }
}