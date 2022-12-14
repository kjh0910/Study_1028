package week_6;

public class 모음_제거 {

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		
		System.out.println(my_string.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", ""));
		
		System.out.println(my_string.replaceAll("[aeiou]", ""));
		
		
		
	}
	public String solution(String my_string) {
		 String answer = "";
	     answer = my_string.replace("a","").replace("e","").replace("i","").replace("o","").replace("u","");
	     return answer;
		
	
	}

}
