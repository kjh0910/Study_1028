package week_6;

public class 팩토리얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int solution(int n) {
	       int answer = 0;
			
		   int i = 1;
		   while(factorial(i) < n) {
				answer = i++;
		   }
			
		   return answer;
	    }
	    
	    public static long factorial(int n) {
			if(n==1) {
				return 1;
			}
			
			return n*factorial(n-1);
		}

}
