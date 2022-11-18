package week_4;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 특정 문자 제거하기
		 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 
		 * letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한사항
		 * 1 ≤ my_string의 길이 ≤ 100
		 * letter은 길이가 1인 영문자입니다.
		 * my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
		 * 대문자와 소문자를 구분합니다.
		 * 
		 * 입출력 예
		 * my_string	letter	result
		 * "abcdef"		"f"		"abcde"
		 * "BCBdbe"		"B"		"Cdbe"
		 * 
		 * 
		 * */
		String my_string = "BCBdbe";
		String letter = "B";
		
		System.out.println(solution(my_string, letter));
		
		
	}	// 메인메서드 끝


	public static String solution(String my_string, String letter) {
		// letter를 제거한 문자열을 담을 변수 answer를 선언 후 공백으로 초기화
		String answer = "";
		
		// my_string 문자열의 인덱스 0 ~ 마지막까지 접근
		// 문자열을 담을 변수 s 선언후 s와 letter를 비교 => 같지 않을 경우에 answer에 누적
		for(int i=0; i<my_string.length(); i++) {
			String s = my_string.charAt(i) + "";
			if(!s.equals(letter)) {
				answer += s;
			}	
		}
		
		return answer;
	}
	

}	// 클래스 끝






















