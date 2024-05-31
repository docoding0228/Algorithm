// class Solution {
//     public String solution(String s) {
//         String answer = "";
//         String[] str = s.split("");
        
//         int idx = 0;
//         for(int i=0; i<str.length; i++) {
//             if(str[i].equals(" ")) {
//                 idx = 0;
//             } else if(idx % 2 == 0) {
//                 str[i] = str[i].toUpperCase();
//                 idx++;
//             } else if(idx % 2 != 0) {
//                 str[i] = str[i].toLowerCase();
//                 idx++;
//             }
//             answer += str[i];
//         } 
//         return answer;
//     }
// }

class Solution {
  public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}