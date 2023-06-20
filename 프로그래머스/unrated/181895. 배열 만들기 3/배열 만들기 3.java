class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        int start2 = intervals[1][0];
        int end2 = intervals[1][1];
        int size = 0;
        for(int i = start1; i <= end1; i++){
            size++;
        }
        for(int i = start2; i <= end2; i++){
            size++;
        }
        int[] answer = new int[size];
        int index = 0;
        for(int i = start1; i <= end1; i++){
            answer[index++] = arr[i];
        }
        for(int i = start2; i <= end2; i++){
            answer[index++] = arr[i];
        }
        return answer;
    }
}