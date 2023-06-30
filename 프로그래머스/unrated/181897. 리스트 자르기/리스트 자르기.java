class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int len = 0;
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1){
            len = b + 1;
        } else if(n == 2){
            len = num_list.length - a;
        } else if(n == 3){
            len = b - a + 1;
        } else{
            len = (b - a) / 2 + 1;
        }
        int[] answer = new int[len];
        int index = 0;
        if(n == 1){
            for(int i = 0; i <= b; i++){
                answer[index++] = num_list[i];
            }
        } else if(n == 2){
            for(int i = a; i < num_list.length; i++){
                answer[index++] = num_list[i];
            }
        } else if(n == 3){
            for(int i = a; i <= b; i++){
                answer[index++] = num_list[i];
            } 
        } else{
            for(int i = a; i <= b; i+=c){
                answer[index++] = num_list[i];
            }
        }
        return answer;
    }
}