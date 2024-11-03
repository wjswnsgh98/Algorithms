class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        for(int i = 0; i < mats.length; i++){
            for(int j = 0; j <= park.length - mats[i]; j++){
                for(int k = 0; k <= park[0].length - mats[i]; k++){
                    boolean chk = true;    
                        for(int l = 0; l < mats[i]; l++){
                            for(int h = 0; h < mats[i]; h++){
                                if(!park[j + l][k + h].equals("-1")){
                                    chk = false;
                                    break;
                                }
                            }  
                            if(!chk) break;
                        }
                    if(chk){
                        if(answer < mats[i]){
                            answer = mats[i];
                        }
                    }
                }
            }
        }
        return answer;
    }
}