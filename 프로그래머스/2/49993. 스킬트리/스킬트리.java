class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i = 0; i < skill_trees.length; i++){
            String s = skill_trees[i].replaceAll("[^"+skill+"]","");
            boolean chk = true;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) != skill.charAt(j)){
                    chk = false;
                    break;
                }
            }
            if(chk){
                answer++;
            }
        }
        return answer;
    }
}