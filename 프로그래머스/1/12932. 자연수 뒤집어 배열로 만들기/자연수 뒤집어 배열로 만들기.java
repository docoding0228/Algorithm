
// class Solution {
//     public int[] solution(long n) {
    
//         String s = String.valueOf(n);
        
//         int[] answer = new int[s.length()];
        
//         for (int i = 0; i < answer.length; i++) {
//             answer[i] = Integer.parseInt(s.substring(answer.length-1-i, answer.length-i));
//         }
        
//         return answer;
//     }
// }

class Solution {
  public int[] solution(long n) {
    String a = "" + n;
    int[] answer = new int[a.length()];

    int cnt=0;

    while(n > 0) {
        answer[cnt]=(int)(n%10);
        n/=10;
        System.out.println(n);
        cnt++;
    }
    
    return answer;
  }
}