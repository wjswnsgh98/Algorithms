class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];
        int answer = 0;
        
        for(int i = 0; i < lines.length; i++){
            int s = lines[i][0] + 100;
            int e = lines[i][1] + 100;
            for(int j = s; j < e; j++){
                count[j]++;
            }
        }
        
        for(int i = 0; i < count.length; i++){
            if(count[i] > 1){
                answer++;
            }
        }
        return answer;
    }
}