package week_5;

import java.math.BigInteger;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * <구슬을 나누는 경우의 수>
		 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 
		 * 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
		 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 
		 * return 하는 solution 함수를 완성해주세요.
		 * 
		 * 제한사항
		 * 1 ≤ balls ≤ 30
		 * 1 ≤ share ≤ 30
		 * 구슬을 고르는 순서는 고려하지 않습니다.
		 * share ≤ balls
		 * 
		 * 입출력 예
		 * balls	share	result
		 * 3		2		3
		 * 5		3		10 
		 * 
		 * 		n!
		 *  --------------
		 *  (n-r)! * r!
		 *  
		 * */
		
		int balls = 5;
		int share = 3;
		
		System.out.println(solution(balls, share));
		
	}	// 메인메서드 끝

	public static BigInteger solution(int balls, int share) {
		int answer = 0;
		BigInteger b = BigInteger.ONE;
		if(balls-share != 0) {
			b = factorial(balls-share);
		}
		BigInteger a = factorial(balls);
		BigInteger c = factorial(share);


		return (a.divide(b.multiply(c)));
	}

	public static BigInteger factorial(int n) {
		if(n<=1) {
			return BigInteger.valueOf(n);
		}else{ 
			return BigInteger.valueOf(n).multiply(factorial(n-1));

		}
	}

}	// 클래스 끝


















