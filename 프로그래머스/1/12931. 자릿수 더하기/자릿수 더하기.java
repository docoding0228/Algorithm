// public class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         String s = Integer.toString(n); //int n을 String으로 변환
        
//         for(int i=0; i<s.length(); i++){
//             answer += Integer.parseInt(s.substring(i, i+1));
//         }
//         return answer;
//     }
// }

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0){
            // answer += n%10;
            // n/=10;
            answer = answer + n%10;
            n = n/10;
        }
        return answer;
    }
}