import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            String ong = babbling[i];
            ong = ong.replace("aya", "---");
            ong = ong.replace("ye", "--");
            ong = ong.replace("woo", "---");
            ong = ong.replace("ma", "--");
            ong = ong.replace("-", "");
            if(ong.equals("")){
                answer++;
            }
        }
        return answer;
    }
}