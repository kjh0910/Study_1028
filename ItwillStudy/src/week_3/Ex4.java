package week_3;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * <배열 뒤집기>
		 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 
		 * 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * */
		int[] num_list = {1, 2, 3, 4, 5};
		
		solution(num_list);
		
		
	}

	// 배열의 위치를 바꾸는 메서드 
	public static int[] solution(int[] num_list) {
		// 주어진 배열의 위치를 바꿔서 저장할 배열을 생성
		int[] answer = new int[num_list.length];

		// 배열에 접근할 인덱스의 초기값을 가장 마지막 index로 저장
		int index = num_list.length-1;
		
		// 매개변수로 받은 배열의 마지막 인덱스부터 0번째 인덱스까지 모든 요소에 접근하여
		// 새로 생성한 배열의 0번째부터 마지막 인덱스까지 저장 (index를 1씩 감소시킴)
		for(int i=0; i<num_list.length; i++) {
			answer[i] = num_list[index];
			index--;
			
		}
		
		printArr(answer);
		
		return answer;
	}	// 솔루션 메서드 끝
	
	// 배열의 모든 인덱스를 출력하는 메서드
	public static void printArr(int[] num_list) {
		for(int i=0; i<num_list.length; i++) {
			System.out.print(num_list[i] + " ");
			
		}
		System.out.println();
		
	}
	
	
}
