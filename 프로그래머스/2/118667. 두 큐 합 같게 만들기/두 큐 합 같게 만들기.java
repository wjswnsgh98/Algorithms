import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        // queue1, queue2 합
        long sum1 = 0, sum2 = 0;
        for(int i = 0; i < queue1.length; i++){
            sum1 += queue1[i];
            sum2 += queue2[i];
        }
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 0; i < queue1.length; i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        
        while(sum1 != sum2){ 
            // answer가 이거보다 크면 원상복귀 될 때까지 안된다는 의미
            if(answer > (queue1.length + queue2.length) * 2){
                return -1;
            }
            
            int num = 0;
            if(sum1 > sum2){
                num = q1.poll();
                q2.add(num);
                sum1 -= (long) num;
                sum2 += (long) num;
                answer++;
            } else if(sum1 < sum2){
                num = q2.poll();
                q1.add(num);
                sum1 += (long) num;
                sum2 -= (long) num;
                answer++;
            } else {
                answer++;
                break;
            }
        }
        return answer;
    }
}