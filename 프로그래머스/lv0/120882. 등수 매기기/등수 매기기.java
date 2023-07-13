import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++){
            list.add(score[i][0] + score[i][1]);
        }
        
        list.sort(Comparator.reverseOrder());
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}