class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] start = new int[2];
        int max = park[0].length();
        int min = -1;
        int x = 0;
        int y = 0;
        
        // 시작점 찾기
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length(); j++){
                char c = park[i].charAt(j);
                if(c == 'S'){
                    x = j;
                    y = i;
                    break;
                }
            }
        }
        
        System.out.print(x + " " + y);
        
        for(int i = 0; i < routes.length; i++){
            char a = routes[i].charAt(0);
            int b = (int)(routes[i].charAt(routes[i].length() - 1)) - '0';
            
            if(a == 'E' && x + b < max){
                boolean flag = true;
                for(int j = x; j <= x + b; j++){
                    if(park[y].charAt(j) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    x = x + b;
                }
                
            } else if(a == 'W' && x - b > min){
                boolean flag = true;
                for(int j = x; j >= x - b; j--){
                    if(park[y].charAt(j) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    x = x - b;
                }
            } else if(a == 'S' && y + b < max){
                boolean flag = true;
                for(int j = y; j <= y + b; j++){
                    if(park[j].charAt(x) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    y = y + b;
                }
            } else if(a == 'N' && y - b > min){
                boolean flag = true;
                for(int j = y; j >= y - b; j--){
                    if(park[j].charAt(x) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    y = y - b;
                }
            } else {
                continue;
            }
        }
        
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}