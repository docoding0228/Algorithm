class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int B = 0, S = 0;
        for(int[] size : sizes){
            B = Math.max(B, Math.max(size[0],size[1]));
            S = Math.max(S, Math.min(size[0],size[1]));
        }
        return B * S;
    }
}