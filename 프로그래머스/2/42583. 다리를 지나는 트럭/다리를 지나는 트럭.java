import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < truck_weights.length; i++){
            while(true){
                // 다리 지나는 트럭이 없을 떄
                if(queue.isEmpty()){
                    queue.offer(truck_weights[i]);
                    sum += truck_weights[i];
                    answer++;
                    break;
                } 
                // 다리 지나는 트럭의 수와 다리 길이가 같을 때 
                else if(queue.size() == bridge_length) {
                    sum -= queue.poll();
                }
                // 다리 지나는 트럭의 수와 다리 길이가 같지 않고 다리 길이만큼 트럭 수가 없을 때
                else {
                    if(sum + truck_weights[i] <= weight){
                        queue.offer(truck_weights[i]);
                        sum += truck_weights[i];
                        answer++;
                        break;
                    } else {
                        queue.offer(0);
                        answer++;
                    }
                } 
            }
            
        }
        return answer + bridge_length;
    }
}