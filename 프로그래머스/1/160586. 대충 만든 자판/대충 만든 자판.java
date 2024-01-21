import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> hm = new HashMap<>();
        
        // keymap 위 모든 알파벳의 최소 클릭 수 구하기
        for(int i = 0; i < keymap.length; i++){
            // 최소 클릭수로 덮어씌우기 위해 문자열 끝부터 시작
            for(int j = 0; j < keymap[i].length(); j++){
                if(hm.containsKey(keymap[i].charAt(j))){
                    // 최소 클릭 수가 뒤에 나왔을 때 경신
                    Integer cnt = hm.get(keymap[i].charAt(j));
                    if(cnt > j + 1){
                        hm.put(keymap[i].charAt(j), j + 1);
                    }
                } else {
                    hm.put(keymap[i].charAt(j), j + 1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            int cnt = 0;
            for(int j = 0; j < targets[i].length(); j++){
                char c = targets[i].charAt(j);
                Integer idx = hm.get(c);
                if(idx != null){
                    cnt += idx;
                } else {
                    cnt = -1;
                    break;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}