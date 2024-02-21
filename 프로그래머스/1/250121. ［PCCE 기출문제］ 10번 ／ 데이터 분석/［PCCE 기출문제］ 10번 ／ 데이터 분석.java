import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        String[] str = {"code", "date", "maximum", "remain"};
        int extIdx = 0, sortIdx = 0;
        
        // ext 변수와 sort_by 변수의 index 값 찾기
        for(int i = 0; i < 4; i++){
            if(ext.equals(str[i])){
                extIdx = i;
            }
            
            if(sort_by.equals(str[i])){
                sortIdx = i;
            }
        }
        
        // lamda, Comparator 사용시 final이나 effectively final 이어야한다.
        final int si = sortIdx;
        
        for(int i = 0; i < data.length; i++){
            if(data[i][extIdx] < val_ext){
                list.add(data[i]);
            }
        }
        
        Collections.sort(list, (o1, o2) -> o1[si] - o2[si]);
        return list;
    }
}