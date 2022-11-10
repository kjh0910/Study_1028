package week_3;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * <직각삼각형 출력하기>
		 * 
		 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 
		 * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
		 * 
		 * 입력 3		출력 => *
		 *				   **
		 *				   ***
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 입력값이 3일때 3줄 출력 => 3번 수행하는 for문
		// 각 행마다 별을 찍는 횟수 => 안쪽 for문으로 이중for문 만듦
		
		// n이 3일때 i=0	j=0
		//		   i=1  j=0,1
		// 		   i=2	j=0,1,2
		// => 각 행마다 j(별)의 출력횟수는 0부터 i번째까지(이하)이다.  
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}

