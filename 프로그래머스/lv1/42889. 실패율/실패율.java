import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        int[] userFailCount = new int[N + 2]; // 각 스테이지에 머물러있는 플레이어수
        int[] userTotalCount = new int[N + 1]; // 각 스테이지에 도달한 플레이어수
        
        // 스테이지마다 머물러있는 플레이어 수 세는 배열
        for(int stage : stages){
            userFailCount[stage]++;
        }
        
        // 스테이지마다 도달한 플레이어 수 세는 배열
        userTotalCount[N] = userFailCount[N] + userFailCount[N + 1];
        for(int i = N - 1; i >= 1; i--){
            userTotalCount[i] = userFailCount[i] + userTotalCount[i + 1];
        }
        
        // 스테이지 별 실패율
        for(int i = 1; i < userTotalCount.length; i++){
            if(userFailCount[i] == 0 || userTotalCount[i] == 0){
                map.put(i, 0.0);
            } else {
                map.put(i, (double)userFailCount[i] / userTotalCount[i]);
            }
        }
        
        // 실패율(value) 값으로 스테이지번호(key)를 내림차순 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}