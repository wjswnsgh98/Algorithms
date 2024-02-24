import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 이중 for문을 쓸시 시간이 너무 오래걸림
        // for(int i = 0; i < callings.length; i++){
        //     for(int j = 0; j < players.length; j++){
        //         if(callings[i].equals(players[j])){
        //             String temp = players[j];
        //             players[j] = players[j - 1];
        //             players[j - 1] = temp;
        //             break;
        //         }
        //     }
        // }
        
        // 그래서 HashMap으로 풀이
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++){
            // 이전 등수
            int rank = map.get(callings[i]);
            // 이전 등수의 선수
            String player = players[rank - 1];
            
            // players 배열 순서 바꿔주기
            players[rank - 1] = callings[i];
            players[rank] = player;
            
            // map 갱신
            map.put(callings[i], rank - 1);
            map.put(player, rank);
        }
        
        
        return players;
    }
}