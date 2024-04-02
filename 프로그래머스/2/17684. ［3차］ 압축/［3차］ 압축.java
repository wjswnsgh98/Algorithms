import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 1; i <= 26; i++){
            map.put(Character.toString((char)(64 + i)), i);
        }
        
        List<Integer> list = new ArrayList<>();
        int index = 27; // map에 저장할 번호
        int i = 0; // 문자 index
        
        while(i < msg.length()){
            if(i == msg.length() - 1){
                // 만약 마지막 인덱스라면, 마지막 문자의 번호를 list에 저장
                list.add(map.get(Character.toString(msg.charAt(i))));
                break;
            }
            // 마지막 인덱스가 아니라면,
            
            // 현재 문자
            String cur = Character.toString(msg.charAt(i));
            i++;
            while(true){
                // 문자 index 번호가 문자 길이보다 크다면 반복문 stop 
                if(i >= msg.length()){
                    break;
                }
                
                // 다음 문자 가져오기
                String next = Character.toString(msg.charAt(i));
                // 현재 문자 + 다음 문자 가 map에 있는지?
                if(!map.containsKey(cur + next)) {
                    // 없다면 추가
                    map.put(cur + next, index);
                    index++;
                    break;
                }
                // map에 있다면 현재 문자에 다음 문자를 붙인다.
                cur += next;
                i++; // map에 없는 경우가 나올 때까지 반복
            }
            list.add(map.get(cur));
        }
        
        // 배열로 리턴
        int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}