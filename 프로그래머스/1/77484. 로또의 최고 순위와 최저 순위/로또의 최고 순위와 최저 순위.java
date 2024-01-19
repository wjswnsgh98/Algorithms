import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zero_cnt = 0;
        for(int i = 0; i < 6; i++){
            if(lottos[i] != 0){
                continue;
            }
            zero_cnt++;
        }
        
        System.out.println(zero_cnt);
        
        int count = 0;
        for(int i = 0; i < win_nums.length; i++){
            for(int j = 0; j < lottos.length; j++){
                if(win_nums[i] == lottos[j]){
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
        int max_cnt = count + zero_cnt;
        int min_cnt = count;
        
        if(max_cnt == 6){
            answer[0] = 1;
        } else if (max_cnt == 5){
            answer[0] = 2;
        } else if (max_cnt == 4){
            answer[0] = 3;
        } else if (max_cnt == 3){
            answer[0] = 4;
        } else if (max_cnt == 2){
            answer[0] = 5;
        } else {
            answer[0] = 6;
        }
        
        if(min_cnt == 6){
            answer[1] = 1;
        } else if (min_cnt == 5){
            answer[1] = 2;
        } else if (min_cnt == 4){
            answer[1] = 3;
        } else if (min_cnt == 3){
            answer[1] = 4;
        } else if (min_cnt == 2){
            answer[1] = 5;
        } else {
            answer[1] = 6;
        }
        
        return answer;
    }
}