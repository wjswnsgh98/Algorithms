import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> repo = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();
        
        // Map 초기화
        for(int i = 0; i < id_list.length; i++){
            repo.put(id_list[i], new HashSet<>());
            cnt.put(id_list[i], i);
        }
        
        // 신고자 id에 대해 누가 신고 했는지 Map에 저장
        for(String s : report){
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            repo.get(to).add(from);
        }
        
        // 이용이 정지된 유저에 대해 해당 유저를 신고한 id에 메일이 몇번 전송되는지 파악
        // repo를 순회하여 사이즈가 2이상인지 확인
        for(int i = 0; i < id_list.length; i++){
            HashSet<String> send = repo.get(id_list[i]);
            if(send.size() >= k){
                for(String name : send){
                    answer[cnt.get(name)]++;
                }
            }
        }
        return answer;
    }
}