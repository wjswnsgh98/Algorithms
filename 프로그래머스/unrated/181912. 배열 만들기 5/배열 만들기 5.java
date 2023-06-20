class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String str[] = new String[intStrs.length];
        for(int i = 0; i < intStrs.length; i++){
            str[i] = intStrs[i].substring(s, s+l);
        }
        int size = 0;
        for(int i = 0; i < str.length; i++){
            if(Integer.parseInt(str[i]) > k){
                size++;
            }
        }
        int[] answer = new int[size];
        int index = 0;
        for(int i = 0; i < str.length; i++){
            if(Integer.parseInt(str[i]) > k){
                answer[index++] = Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}