class Solution {
    public int[] solution(int[] arr) {
        int result = 1;
        while(arr.length > result){
            result *= 2;
        }
        //System.out.println(result);
        int[] answer = new int[result];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}