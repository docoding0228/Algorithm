// class Solution {
//     public int[] solution(int n, int m) {
//         int[] answer = new int[2];
        
//         int max = Math.max(n, m);
//         int min = Math.min(n, m);
        
//         answer[0] = getGcd(max, min);
//         answer[1] = max * min / answer[0];
        
//         return answer;
//     }
    
//     public int getGcd(int max, int min) {

//         if(max%min == 0) return min;
//         else return getGcd(min, max%min);

//     }
// }

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }
}