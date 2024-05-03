class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int test = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            test += arr[i];
        }
        answer = (double)test / arr.length;
        return answer;
    }
}
