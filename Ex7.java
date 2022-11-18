package week_4;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * 진료 순서 정하기
		 * 문제 설명
		 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
		 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를
		 * 정한 배열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한사항
		 * 중복된 원소는 없습니다.
		 * 1 ≤ emergency의 길이 ≤ 10
		 * 1 ≤ emergency의 원소 ≤ 100
		 * 
		 * 입출력 예
		 * emergency				result
		 * [3, 76, 24]				[3, 1, 2]
		 * [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
		 * [30, 10, 23, 6, 100]		[2, 4, 3, 5, 1]
		 * 
		 * 
		 * */
		
		int[] emergency = {30, 10, 23, 6, 100};
		System.out.println(Arrays.toString(solution(emergency)));
		
	}
	
	public static int[] solution(int[] emergency) {
		// 순서를 저장할 arr배열을 매개변수로 받을 배열과 같은 길이로 생성  
		int[] arr = new int[emergency.length];

		// 응급도 : 1부터 시작하므로 arr배열의 모든 값을 1로 저장
		for(int i=0; i<emergency.length; i++) {
			arr[i] = 1;
			
		}
		
		// 첫번째 배열부터 다른 배열들과 값을 비교하기위해 이중for문 사용
		// 인덱스[i]번째의 값이 다른 인덱스의 값보다 작으면(응급도가 낮으면) 값을 1증가 
		for(int i=0; i<emergency.length; i++) {
			for(int j=0; j<emergency.length; j++) {
				if(emergency[i] < emergency[j]) {
					arr[i]++;
				}
				
			}
			
		}
		return arr;
	}

}












