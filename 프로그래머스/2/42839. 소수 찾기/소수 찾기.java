import java.util.List;
import java.util.ArrayList;

class Solution {
    static List<Integer> list = new ArrayList<>();
    static boolean[] check = new boolean[7];
    
    public int solution(String numbers) {
        int answer = 0;
        for(int i = 0; i < numbers.length(); i++){
            dfs(numbers, "", i + 1);
        }
        
        for(int i = 0; i < list.size(); i++){
            if(prime(list.get(i))){
                answer++;
            }
        }
        return answer;
    }
    
    // 백트래킹
    static void dfs(String str, String s, int len){
        if(s.length() == len){
            int num = Integer.parseInt(s);
            if(!list.contains(num)){
                list.add(num);
            }
        }

        for(int i = 0; i < str.length(); i++){
            if(!check[i]){
                check[i] = true;
                s += str.charAt(i);
                dfs(str, s, len);
                check[i] = false;
                s = s.substring(0, s.length() - 1);
            }
        }
    }

    // 소수 찾기
    static boolean prime(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
}
