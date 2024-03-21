import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new ArrayList<>();
        
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        for(int i = 0; i < cities.length; i++){
            String city = cities[i].toUpperCase();
            
            // 도시를 포함할 경우 - 해당 도시 지우고 다시 추가
            if(cache.contains(city)){
                cache.remove(city);
                cache.add(city);
                answer += 1;
            } else { // 도시를 안 포함할 경우
                if(cacheSize == cache.size()){ // 캐시크기랑 캐시 리스트 크기가 같을 때 젤 앞에(오래된) 도시 지운 후
                    cache.remove(0);
                }
                // 도시 추가
                cache.add(city);
                answer += 5;
            }
        }
        return answer;
    }
}