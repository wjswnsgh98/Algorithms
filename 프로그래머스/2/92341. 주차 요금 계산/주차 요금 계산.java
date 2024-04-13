import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, Integer> map1 = new HashMap<>(); // 차번호, 입장시간
        Map<Integer, Integer> map2 = new HashMap<>(); // 차번호 중복체크, 주차시간

        int exit = 23 * 60 + 59;
        int baseTime = fees[0], baseFee= fees[1], fee = fees[3];
        double time = fees[2]; // 반올림 해줘야 하므로 double

        for(String r : records){  //map1에 records 입력
            int carNum = Integer.valueOf(r.substring(6, 10));
            int min = Integer.valueOf(r.substring(3,5)) 
                + Integer.valueOf(r.substring(0,2)) * 60;

            if(r.charAt(11) == 'I') map1.put(carNum, min);
            else{
                int ent = map1.get(carNum);
                map2.put(carNum, map2.getOrDefault(carNum, 0) + min - ent);
                map1.remove(carNum);
            }
        }

        for(int key : map1.keySet()) //퇴장 안한 차 마무리
            map2.put(key, map2.getOrDefault(key, 0) + exit - map1.get(key));

        for(int key : map2.keySet()) //순서 정렬
            pq.add(key);

        int[] answer = new int[map2.size()];
        for(int i = 0; i < answer.length; i ++){ // pq 순서대로 계산하여 입력
            int overTime = map2.get(pq.poll()) - baseTime;;
            if(overTime < 0) overTime = 0;
            answer[i] = baseFee + (int) Math.ceil(overTime / time) * fee;
        }

        return answer;
    }
}