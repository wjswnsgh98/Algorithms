import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            // 의상 종류 별로 몇개씩 있는지 저장
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for(String key : map.keySet()){
            // 조합 -> 안입는 경우도 고려하기 위해 + 1
            answer *= (map.get(key) + 1);
        }
        
        // 모두 안입음일 경우 -1
        answer -= 1; 
        
        return answer;
    }
}