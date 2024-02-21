class Solution {
    public int[] solution(String[] wallpaper) {
        int maxRow, maxCol;
        int minRow, minCol;
        
        minCol = minRow = Integer.MAX_VALUE;
        maxCol = maxRow = Integer.MIN_VALUE;
        
        for(int r = 0; r < wallpaper.length; r++){
            for(int c = 0; c < wallpaper[0].length(); c++){
                if(wallpaper[r].charAt(c) == '#'){
                    maxRow = Math.max(maxRow, r);
                    maxCol = Math.max(maxCol, c);
                    minRow = Math.min(minRow, r);
                    minCol = Math.min(minCol, c);
                }
            }
        }
        return new int[]{minRow, minCol, maxRow + 1, maxCol + 1};
    }
}