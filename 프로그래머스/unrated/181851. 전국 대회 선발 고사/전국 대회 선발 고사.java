import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[][] result = new int[rank.length][2];
        for(int i = 0; i < rank.length; i++){
            result[i][0] = rank[i];
            result[i][1] = i;
        }
        
        // result 배열을 a[0] - b[0]를 기준으로 오름차순으로 정렬합니다. 
        // 이렇게 하면 result 배열은 rank 배열의 값에 따라 정렬됩니다.
        Arrays.sort(result, (a, b) -> a[0] - b[0]);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[result[i][1]]){
                list.add(result[i][1]);
                if(list.size() == 3){
                    break;
                }
            }
        }
        answer = 10000*list.get(0) + 100*list.get(1)+list.get(2);
        return answer;
    }
}