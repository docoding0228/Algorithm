# // class Solution {
# //     public int solution(int left, int right) {
# //         int answer = 0;
        
# //         for(int i=left; i<=right; i++) {
# //             int cnt = 1;
            
# //             for(int j=1; j<=i/2; j++) {
# //                 if(i % j == 0) cnt++;
# //             }
            
# //             if(cnt % 2 == 0) answer += i;
# //             else answer -= i;
# //         }
# //         return answer;
# //     }
# // }

def solution(left, right):
    answer = 0
    for i in range(left, right+1):	#left 부터 right까지 1씩 증가하는 for문
        
        now_count = 0;			\
        #약수의 개수를 담기위한 변수
        
        for j in range(1, i+1):	 
        #1부터 i까지 증가하며 약수를 찾아냅니다.
           
            if i % j == 0:	
            #나누어 떨어지는 수는 약수!    
                
                now_count +=1;		
                #약수라면 개수를 증가시켜줍니다.
        
        if now_count % 2 == 0:	
        #이제 개수가 홀수인지 짝수인지 판별하여
            
            answer += i			
            #짝수라면 더해주고
        else:
            answer -= i			
            #홀수라면 빼줍니다.
            
    return answer			
    #끝!