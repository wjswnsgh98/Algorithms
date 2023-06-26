class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];
            for(int i = start; i <= end; i++){
                answer[i] += 1;
            }
        }
        return answer;
    }
}