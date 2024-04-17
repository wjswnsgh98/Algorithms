import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")){
                map.put(str[1], str[2]);
            } else if(str[0].equals("Leave")){
                continue;
            } else {
                map.put(str[1], str[2]);
                count++;
            }
        }
        
        String[] answer = new String[record.length - count];
        int index = 0;
        
        for(int i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")){
                answer[index++] = map.get(str[1]) + "님이 들어왔습니다.";
            } else if(str[0].equals("Leave")){
                answer[index++] = map.get(str[1]) + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}