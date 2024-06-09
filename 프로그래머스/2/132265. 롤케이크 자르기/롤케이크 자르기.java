import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
//         시간초과 난 코드
//         for(int i = 0; i < topping.length; i++){
//             List<Integer> cheol = new ArrayList<>();
//             for(int j = 0; j < i; j++){
//                 if(cheol.size() == 0){
//                     cheol.add(topping[j]);
//                 } else {
//                     if(!cheol.contains(topping[j])){
//                         cheol.add(topping[j]);
//                     }
//                 }
                
//             }
            
//             List<Integer> dong = new ArrayList<>();
//             for(int k = i; k < topping.length; k++){
//                 if(dong.size() == 0){
//                     dong.add(topping[k]);
//                 } else {
//                     if(!dong.contains(topping[k])){
//                         dong.add(topping[k]);
//                     }
//                 }
//             }
            
//             if(cheol.size() == dong.size()){
//                 answer++;
//             }
//         }
        
        Set<Integer> cheol = new HashSet<>();
        Map<Integer, Integer> dong = new HashMap<>();
        
        for(int k : topping){
            dong.put(k, dong.getOrDefault(k, 0) + 1);
        }
        
        for(int k : topping){
            cheol.add(k);
            dong.put(k, dong.get(k) - 1);
            
            if(dong.get(k) == 0){
                dong.remove(k);
            }
            
            if(cheol.size() == dong.size()){
                answer++;
            }
        }
        return answer;
    }
}