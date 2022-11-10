package week_3;

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * <문자 반복 출력하기> + 4
		 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 
		 * n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * <입출력 예>
		 * my_string	n	result
		 * "hello"		3	"hhheeellllllooo"
		 * 
		 * */
		
		
		
	}
	public static String solution(String my_string, int n) {
		// 반복할 문자열의 값을 담을 문자열변수 선언 후 초기화
		String answer = "";
		
		// 문자열의 첫번째부터 마지막까지 모두 charAt(i)로 접근하기위해서 for문 사용
		// n번만큼 반복하기 위해 for문 사용해서 answer변수에 문자열을 누적
		for(int i=0; i<my_string.length(); i++) {
			for(int j=0; j<n; j++) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}

}
