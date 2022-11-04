package week2;

public class Ex10 {

	public static void main(String[] args) {
		
				/* 백준 별찍기 -15
				 * 			
				 * 			*
				 * 		   * *
				 *        *   *
				 *       *     *    
				 * 
				 * 
				 * 
				 * */
		
				int line = 4;		 // 전체 행
				int mspace = 0;		 // 중간공백
				int space = line-1;	 // 좌, 우 공백
				
				
				// 첫쨋 줄에 별 1개 찍기
				// 죄공백: 5개
				for(int i=0; i<line+1; i++) {
					System.out.print(" ");
					
				}
				
				// * 1개 찍고 줄바꾸기
				System.out.println("*");
				
				
				// 2번째 행부터 공백 * 가운데공백 * 순으로 별찍기
				for(int i=1; i<line; i++) {
					
					// 좌공백
					for(int j=0; j<=space; j++) {
						System.out.print(" ");
					}

					// 별
					System.out.print("*");

					// 중간공백
					for(int j=0; j<=mspace; j++) {
						System.out.print(" ");

					}
					
					// 별
					System.out.print("*");

					// 우공백
//					for(int j=space; j<=line; j++) {
//						System.out.print(" ");
//					}
					
					System.out.println();
					space--;
					mspace += 2;
				}

	}


}

