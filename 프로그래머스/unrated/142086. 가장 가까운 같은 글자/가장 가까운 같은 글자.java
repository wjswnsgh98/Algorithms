import java.util.ArrayList;
class Solution {
    public int[] solution(String s) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            String st = Character.toString(s.charAt(i));
            if(!list.contains(st)){
                list1.add(-1);
            } else {
                list1.add(i - list.lastIndexOf(st));
            }
            list.add(st);
        }
        
        int[] answer = new int[list1.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list1.get(i);
        }
        return answer;
    }
}