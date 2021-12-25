package section3;


import java.util.*;
class Five {	
	public int solution(int n){
		int answer=0, sum=0;
		
        
        int m=n/2+1;            // 이걸 생각하는게 매우 중요함 
		
        
        int[] arr=new int[m];
		for(int i=0; i<m; i++) arr[i]=i+1;
		
        int lt=0;
		for(int rt=0; rt<m; rt++){
			sum+=arr[rt];
			if(sum==n) answer++;
			while(sum>=n){
				sum-=arr[lt++];
				if(sum==n) answer++; 
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Five T = new Five();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.print(T.solution(n));
	}
}