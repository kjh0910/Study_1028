package week_3;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * <짝수 홀수 개수>
		 * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은
		 * 배열을 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * <입출력 예>
		 * num_list			result
		 * [1, 2, 3, 4, 5]	[2, 3]
		 * [1, 3, 5, 7]		[0, 4]
		 * */
		
		
		
		
	}
	
	public static int[] solution(int[] num_list) {
        // 매개변수로 받은 배열의 짝수, 홀수의 개수를 담는 배열을 생성하고 길이를 0으로 초기화
		int[] count = {0, 0};
		
		// 배열의 길이동안 조건문 사용 => 짝수이면 count[0]번째 값을 1증가
		//							홀수이면 count[1]번째 값을 1증가
		for(int i=0; i<num_list.length; i++) {
			if(num_list[i] % 2 ==0) 	count[0]++;
			else						count[1]++;
		}
		
        return count;
    }

}
