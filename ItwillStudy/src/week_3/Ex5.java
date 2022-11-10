package week_3;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * <문자열 뒤집기>
		 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 
		 * return하도록 solution 함수를 완성해주세요.
		 * 
		 * 입출력 예
		 * my_string	return
		 * "jaron"		"noraj"
		 * "bread"		"daerb"
		 * 
		 * */
		
		// 테스트
		System.out.println(solution("jaron"));
		
		
	}
	
	public static String solution(String my_string) {
		// 매개변수로 받은 문자열을 거꾸로 담을 String변수 선언 후 초기화
        String answer = "";
        
        // my_string변수의 n번째 글자를 출력하는 메서드 : String클래스의 charAt(i) 사용
        // 이때 배열의 마지막 index부터 0까지 1씩 감소하면서 answer에 문자열을 누적함
        for(int i=my_string.length()-1; i>=0; i--) {
        	answer += my_string.charAt(i);
        	
        }
        
        return answer;
    }
	
	

}
