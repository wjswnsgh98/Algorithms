import java.util.ArrayList;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < t.length(); i++){
            list.add(t.substring(i, i + p.length()));
            if (i + p.length() == t.length()){
                break;
            }
        }
        
        Long pi = Long.parseLong(p);
        for(int i = 0; i < list.size(); i++){
            if(Long.parseLong(list.get(i)) <= pi){
                answer++;
            }
        }
        return answer;
    }
}