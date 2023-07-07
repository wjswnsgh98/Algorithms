import java.util.List;
import java.util.Arrays;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String str = "";
        String str1 = "";
        for(int i = 0; i < dic.length; i++){
            str = dic[i];
            int count = 0;
            for(int j = 0; j < spell.length; j++){
                str1 = spell[j];
                if(str.contains(str1)){
                    count++;
                } else {
                    break;
                }
            }
            if(count == spell.length){
                answer = 1;
            }
        }
        return answer;
    }
}