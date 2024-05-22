//class Solution {
//  public String solution(int n) {
//    String answer = "";
 
//    for(int i=1; i<=n; i++) {
//       if(i%2 != 0) answer += "수";
//          else answer += "박";
//     }
//     return answer;
//   }
// }

// class Solution {
//     public String solution(int n) {
//         String answer = "";
//         for(int i=1; i<=n; i++) {
//             answer += i%2!=0 ? "수" : "박";
//         }
//         return answer;
//     }
// }

// class Solution {
//     public String solution(int n){
//         String result = "";
        
//         for(int i=0;i<n;i++) {
//             result +=(i%2==0)? "수":"박";
//         }
        
//         return result;
//     }
// }

public class Solution {
    public String solution(int n)
    {
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
