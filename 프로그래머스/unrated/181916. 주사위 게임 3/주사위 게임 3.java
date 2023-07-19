import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] num = {a, b, c, d};
        int[] count = new int[6];
        int answer = 0;
        Arrays.sort(num);
        for(int i = 0; i < 4; i++){
            count[num[i]-1]++;
        }
        
        int mul = 1;
        for(int i = 0; i < count.length; i++){
            if(count[i] == 4){
                answer = 1111 * (i+1);
                break;
            } else if(count[i] == 3){
                for(int j = 0; j < 6; j++){
                    if(count[j] == 1){
                        answer = (10 * (i + 1) + (j + 1)) * (10 * (i + 1) + (j + 1));
                        break;
                    }
                }
            } else if(count[i] == 2){
                for(int j = 0; j < 6; j++){
                    if(count[j] == 2){
                        if(i==j){
                            continue;
                        } else {
                            answer = ((i+1) + (j+1)) * Math.abs((i+1) - (j+1));
                            break;
                        }
                    } else if(count[j] == 1){
                        mul *= (j+1); 
                    }
                }
                if(mul != 1){
                    answer = mul;
                }
            } else if(num[0] != num[1] && num[1] != num[2] && num[2] != num[3]){
                answer = num[0];
            } 
        }
        return answer;
    }
}