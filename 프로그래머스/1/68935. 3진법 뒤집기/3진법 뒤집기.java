// class Solution {
//     public int solution(int n) {
//         String str = "";

//         while (n != 0) {
//             str += n % 3;
//             n /= 3;
//         }
//         return Integer.parseInt(str, 3);
//     }
// }

class Solution {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();
        return Integer.parseInt(a,3);
    }
}