package week2;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 
		 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
		 * 
		 * 입출력 예
		 * n	result
		 * 7	1
		 * 1	1
		 * 15	3
		 * 
		 * */
		
		
	}

}

class Solution5 {
    public int solution(int n) {
    	// 피자의 수를 저장할 변수 선언 후 0으로 초기화
        int pizza = 0;
        
        // 피자 1 판이 7조각이므로 7의 배수(n이 7로 나누어 떨어지는 경우)는 n/7의 몫만큼 피자개수가 필요함
        // n이 7의 배수가 아니라면 모든 사람이 최소 한 조각을 먹기위해서 n/7의 몫에 1판을 더해야함
        if(n % 7==0) {
            pizza = n/7;
        } else {
            pizza = n/7 + 1;
        }
        
        return pizza;
    }
}