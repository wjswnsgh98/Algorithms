class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum = 0;
        int sum1 = 0;
        if(arr1.length < arr2.length){
            answer = -1;
        }
        else if(arr1.length == arr2.length){
            for(int i =0; i < arr1.length; i++){
                sum += arr1[i];
                sum1 += arr2[i];
            }
            if(sum > sum1){
                answer = 1;
            }
            else if(sum == sum1){
                answer = 0;
            }
            else{
                answer = -1;
            }
        }
        else{
            answer = 1;
        }
        return answer;
    }
}