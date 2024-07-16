import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] bookTime = new int[book_time.length][2];
        
        for(int i = 0; i < book_time.length; i++){
            int s = Integer.parseInt(book_time[i][0].replace(":", ""));
            int e = Integer.parseInt(book_time[i][1].replace(":", ""));
            
            // 10분 청소시간 추가
            e += 10;
            
            if(e % 100 >= 60){
                e += 40;
            }
            
            bookTime[i][0] = s;
            bookTime[i][1] = e;
        }
        
        // a1[0]의 오름차순 a2[0] - a1[0]일 경우 a1[0]의 내림차순
        Arrays.sort(bookTime, (a1, a2) -> a1[0] - a2[0]);
        
        // a[1](두번째 원소) 기준 오름차순
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        
        for(int[] book : bookTime){
            if(pq.isEmpty()){
                pq.add(book);
            } else {
                int[] temp = pq.peek();
                int s = temp[0];
                int e = temp[1];
                
                if(book[0] >= e){
                    pq.poll();
                }
                pq.add(book);
            }
        }
        answer = pq.size();
        return answer;
    }
}