package week2;

public class Ex7 {

	public static void main(String[] args) {
		/* <피자 나눠 먹기 (3)>
		 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 
		 * 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 
		 * 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * */
	}

}

class Solution7 {
    public int solution(int slice, int n) {
    	
//      피자 나눠먹기 (1)과 유사한 문제
// 		피자 1 판 = slice조각이므로  n/slice의 몫만큼 피자개수가 필요함
// 		n/slice의 몫이 0으로 나누어떨어지지 않으면 모든 사람이 최소 한 조각을 먹기위해서 n/slice의 몫에 1판을 더해야함  
       if(n % slice == 0)  {return n / slice;     }
       else                {return n / slice + 1; }
    }
}