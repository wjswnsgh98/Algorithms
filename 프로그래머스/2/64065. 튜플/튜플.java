import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<Integer> solution(String s) {
        List<Integer> answer = new ArrayList<>();
        // {{, }} 자르기
        s = s.substring(2, s.length() - 2);
        s = s.replace("},{", "-");
        String[] str = s.split("-");
        Arrays.sort(str, (String a, String b) -> a.length() - b.length());
        
        for(int i = 0; i < str.length; i++){
            String[] temp = str[i].split(",");
            for(int j = 0; j < temp.length; j++){
                if(!answer.contains(Integer.parseInt(temp[j]))){
                    answer.add(Integer.parseInt(temp[j]));
                }
            }
        }
        return answer;
    }
}