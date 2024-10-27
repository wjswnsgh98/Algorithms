class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] video_len1 = video_len.split(":");
        String[] pos1 = pos.split(":");
        String[] op_start1 = op_start.split(":");
        String[] op_end1 = op_end.split(":");
        int videotime = Integer.parseInt(video_len1[0]) * 60 + Integer.parseInt(video_len1[1]);
        int postime =  Integer.parseInt(pos1[0]) * 60 + Integer.parseInt(pos1[1]);
        int starttime = Integer.parseInt(op_start1[0]) * 60 + Integer.parseInt(op_start1[1]);
        int endtime = Integer.parseInt(op_end1[0]) * 60 + Integer.parseInt(op_end1[1]);
        
        if(starttime <= postime && postime <= endtime){
            postime = endtime;
        }
            
        for(int i = 0; i < commands.length; i++){           
            if(commands[i].equals("prev")){ // 이전 또는 이후로 이동
                postime -= 10;
            } else {
                postime += 10;
            }
            
            if(videotime < postime){ // 동영상 범위 벗어나지 않기
                postime = videotime;
            } else if(postime < 0){
                postime = 0;
            }
            
            if(starttime <= postime && postime <= endtime){ // 오프닝 시간대에 있을경우 오프닝 엔드 타임으로 이동
                postime = endtime;
            }
        }
        
        String m = Integer.toString(postime / 60);
        String s = Integer.toString(postime % 60);
        if((postime / 60) < 10){
            m = "0" + m;
        }
        
        if((postime % 60) < 10){
            s = "0" + s;
        }
        answer = m + ":" + s;
        return answer;
    }
}