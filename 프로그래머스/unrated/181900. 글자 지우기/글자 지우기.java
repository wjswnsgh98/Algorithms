class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        boolean[] remove = new boolean[ch.length];
        for(int i = 0; i < indices.length; i++){
            remove[indices[i]] = true;
        }
        for(int i = 0; i < ch.length; i++){
            if(!remove[i]){
                answer += ch[i];
            }
        }
        return answer;
    }
}