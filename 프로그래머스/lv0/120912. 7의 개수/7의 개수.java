class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i = 0; i < array.length; i++){
            str += Integer.toString(array[i]);
        }
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '7'){
                answer++;
            }
        }
        return answer;
    }
}