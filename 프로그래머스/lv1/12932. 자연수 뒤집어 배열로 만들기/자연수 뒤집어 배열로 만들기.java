class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String[] ans = str.split("");
        int[] answer = new int[ans.length];
        int index = 0;
        for(int i = ans.length-1; i >= 0; i--){
            answer[index++] = Integer.valueOf(ans[i]);
        }
        return answer;
    }
}