package week_5;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * <가위 바위 보>
		 * 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 
		 * 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 
		 * 문자열을 return하도록 solution 함수를 완성해보세요.
		 * 
		 * rsp		result
		 * "2"		"0"
		 * "205"	"052"
		 * 
		 * */
		
		String[] rspArr = {"2", "0", "5"};
		String answer = "";
		String rsp = "205";
		int rspInt = Integer.parseInt(rsp);

		for(int i=0; i<rsp.length(); i++) {
			String compare = rsp.charAt(i)+"";
			
			switch (compare) {
			case "2":
				answer += "0";
				break;

			case "0":
				answer += "5";
				break;
			
			case "5":
				answer += "2";
				break;
			}
			
		}

//		for(int i=0; i<rsp.length(); i++) {
//			String compare = rsp.charAt(i)+"";
//			if(compare.equals("2")) {
//				answer += "0";
//			} else if(compare.equals("0")) {
//				answer += "5";
//			} else {
//				answer += "2";
//			}
//
//		}
		
		System.out.println(answer);
		
		
	}	// 메인메서드 끝
	
	public String solution(String rsp) {
        String answer = "";
        return answer;
    }

}	// 클래스 끝
