import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length() - 1; i++){
            String str = "";
            str = str1.substring(i, i + 2);
            if(str.matches("^[a-zA-Z]*$")){
                list1.add(str);
            }
        }
        
        for(int i = 0; i < str2.length() - 1; i++){
            String str = "";
            str = str2.substring(i, i + 2);
            if(str.matches("^[a-zA-Z]*$")){
                list2.add(str);
            }
        }
        
        List<String> listGyo = new ArrayList<>();
        List<String> listHab = new ArrayList<>();
        
        // 교집합과 합집합
        for(String s : list1) {
            if(list2.remove(s)) {
                listGyo.add(s);
            }
            listHab.add(s);
        }
        // listHab와 남아있는 list2 합집합
        listHab.addAll(list2);
        
        double jaka = 0;
        if(listHab.size() == 0){
            jaka = 1;
        } else {
            jaka = (double) listGyo.size() / (double) listHab.size();
        }
        
        answer = (int) (jaka * 65536);
        return answer;
    }
}