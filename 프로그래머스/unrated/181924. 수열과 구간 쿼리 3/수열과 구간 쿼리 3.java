class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int temp = 0;
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];
            temp = answer[start];
            answer[start] = answer[end];
            answer[end] = temp;
        }
        return answer;
    }
}