package week_6;

public class 숨어있는_숫자의_덧셈_1 {

	public static void main(String[] args) {
		String my_string = "101a2b3c4d01230Z";
		int answer = 0;
				
		answer = Integer.parseInt(my_string.replaceAll("[a-z|A-Z]", ""));

		System.out.println(answer);
		
		int sum = 0;
		
		while(answer > 0) {
			sum += answer % 10;
			answer /= 10;
			
		}
		
		System.out.println(sum);
		
//		String my_string = "101a2b3c4d01230Z";
//		int answer = 0;
//		int sum = 0;
//		
//		try {
//			answer = Integer.parseInt(my_string.replaceAll("[a-z|A-Z]", ""));
//		} catch (Exception e) {
//			answer += 0; 
//		}
//		
//		while(answer > 0) {
//			sum += answer % 10;
//			answer /= 10;
//
//		}
//
//		System.out.println(sum);
		
		
		
		
		
	}
	
	public int solution(String my_string) {
		int answer = 0;
		return answer;
	}

}
