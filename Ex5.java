package week_4;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * <배열 자르기>
		 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 
		 * num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * 제한사항
		 * 2 ≤ numbers의 길이 ≤ 30
		 * 0 ≤ numbers의 원소 ≤ 1,000
		 * 0 ≤num1 < num2 < numbers의 길이
		 * 
		 * 입출력 예
		 * numbers			num1	num2	result
		 * [1, 2, 3, 4, 5]	1		3		[2, 3, 4]
		 * [1, 3, 5]		1		2		[3, 5]
		 * 
		 * */
		
		int[] numbers = {1, 2, 3, 4, 5};
		int[] answer = solution(numbers, 1, 3);
		System.out.println(Arrays.toString(answer));
		
		
	}
	
	 public static int[] solution(int[] numbers, int num1, int num2) {
		 
		 // num1부터 num2까지의 정수를 담을 배열을 선언
		 int[] answer = new int[num2-num1+1];
	       
		 	// 0부터 answer길이까지 반복
		 	// numbers배열의 num1인덱스부터 answer배열에 저장후 num1을 1씩 증가시킴 
	        for(int i=0; i<answer.length; i++) {
	        	answer[i] = numbers[num1++]; 
	        
	        }
	            
	        return answer;
	    }

}
