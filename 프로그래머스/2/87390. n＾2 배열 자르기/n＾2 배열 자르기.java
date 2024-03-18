import java.util.*;

class Solution {
//     메모리 초과 오류 난 코드
//     public int[] solution(int n, long left, long right) {
//         int l = Long.valueOf(left).intValue();
//         int r = Long.valueOf(right).intValue();
//         int[] answer = new int[r - l + 1];
//         int[][] num = new int[n][n];
//         int[] number = new int[n * n];
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 if(i == 0 && j == 0){
//                     num[i][j] = i + 1;
//                 } else {
//                     num[i][j] = Math.max(i, j) + 1;
//                 }
//             }
//         }
        
//         int xIndex = 0;
//         int yIndex = 0;
//         for(int i = 0; i < number.length; i++){
//             if(xIndex == n){
//                 yIndex++;
//             }
            
//             if(xIndex >= n){
//                 xIndex -= n;
//             }
//             number[i] = num[xIndex++][yIndex];
//         }
        
//         int index = 0;
//         for(int i = l; i <= r; i++){
//             answer[index++] = number[i];
//         }
        
        
//         return answer;
//     }
    
    public List<Long> solution(int n, long left, long right) {
        List<Long> answer = new ArrayList<>();
        for(long i = left; i <= right; i++){
            answer.add(Math.max(i / n, i % n) + 1);
        }
        return answer;
    }
}