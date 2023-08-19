import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int s = commands[i][0] - 1;
            int e = commands[i][1] - 1;
            int[] arr = new int[e - s + 1];
            for(int j = s; j <= e; j++){
                arr[j - s] = array[j];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }
        return answer;
    }
}