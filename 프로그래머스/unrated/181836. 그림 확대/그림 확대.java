import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i< picture.length; i++){
            String[] str = picture[i].split("");
            String str1 = "";
            for(int j = 0; j < str.length; j++){
                str1 += str[j].repeat(k); // 반복해주는 메서드    
            }
            for(int n = 0; n < k; n++){
                list.add(str1);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}