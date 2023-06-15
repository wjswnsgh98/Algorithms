class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int cnt = 0;
        int cnt1 = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                cnt++;
            }
            else{
                cnt1++;
            }
        }
        answer[0] = cnt;
        answer[1] = cnt1;
        return answer;
    }
}