class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            String n = Long.toBinaryString(numbers[i]);
            
            if(numbers[i] % 2 == 0){
                answer[i] = numbers[i] + 1;
            } else {
                String str = "";
                if(!n.contains("0")){
                    str = n.substring(0, 1) + "0" + n.substring(1);
                    answer[i] = Long.parseLong(str, 2);
                } else {
                    int idx = n.lastIndexOf("0");
                    str = n.substring(0, idx) + "10" + n.substring(idx + 2);
                    answer[i] = Long.parseLong(str, 2);
                }
            }
        }
        return answer;
    }
}