class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[100000];
        for(int i = 0; i < strArr.length; i++){
            count[strArr[i].length()]++;
            
            if(count[strArr[i].length()] > answer){
                answer = count[strArr[i].length()];
            }
        }
        return answer;
    }
}