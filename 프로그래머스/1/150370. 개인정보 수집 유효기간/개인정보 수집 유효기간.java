import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> term = new HashMap<>();
        for(int i = 0; i < terms.length; i++){
            String[] s = terms[i].split(" ");
            int x = Integer.parseInt(s[1]);
            term.put(s[0], x);
        }
        
        int todayY = Integer.parseInt(today.substring(0, 4));
        int todayM = Integer.parseInt(today.substring(5, 7));
        int todayD = Integer.parseInt(today.substring(8));
        int totalT = (todayY * 12 * 28) + (todayM * 28) + todayD;
        
        for(int i = 0; i < privacies.length; i++){
            int privacyY = Integer.parseInt(privacies[i].substring(0, 4));
            int privacyM = Integer.parseInt(privacies[i].substring(5, 7));
            int privacyD = Integer.parseInt(privacies[i].substring(8, 10));
            int totalP = (privacyY * 12 * 28) + (privacyM * 28) + privacyD;
            
            int ter = term.get(String.valueOf(privacies[i].charAt(privacies[i].length() - 1)));
            if(totalP + (ter * 28) <= totalT){
                list.add(i + 1);
            }
        }
        return list;
    }
}