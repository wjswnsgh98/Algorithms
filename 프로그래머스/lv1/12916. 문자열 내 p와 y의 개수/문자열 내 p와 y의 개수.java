class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        String[] str = s.split("");
        int pcount = 0;
        int ycount = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("p")){
                pcount++;
            } else if(str[i].equals("y")){
                ycount++;
            }
        }
        
        if(pcount != ycount){
            answer = false;
        }
        return answer;
    }
}