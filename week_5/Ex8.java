package week_5;

import java.util.Arrays;

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * 배열 회전시키기
		 * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 
		 * direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한사항
		 * 3 ≤ numbers의 길이 ≤ 20
		 * direction은 "left" 와 "right" 둘 중 하나입니다.
		 * 
		 * 입출력 예
		 * numbers						direction	result
		 * [1, 2, 3]					"right"		[3, 1, 2]
		 * [4, 455, 6, 4, -1, 45, 6]	"left"		[455, 6, 4, -1, 45, 6, 4]
		 * 
		 * */
		
		
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "right";
		
		System.out.println(Arrays.toString(solution(numbers, "left")));

		
	}	// 메인메서드 끝
	
	public static int[] solution(int[] numbers, String direction) {
		int n = 1;

		if(direction.equals("right")) {
			n = numbers.length - 1;
		}

		for(int i=0; i<n; i++ ) {
			int tmp = numbers[0];

			for(int j=1; j<numbers.length; j++) {
				numbers[j-1] = numbers[j];
			}
			numbers[numbers.length-1] = tmp;
		}


		return numbers;
	}


}	// 클래스 끝





















