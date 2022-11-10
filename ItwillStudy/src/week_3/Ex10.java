package week_3;

public class Ex10 {

	public static void main(String[] args) {
		// 백준 별찍기 -19
		
		// 1. 맨 처음, 끝 줄은 전부 *로 채운다.
		// 2. 두번째 줄, 끝에서 두번째 줄은 행의 처음과 끝에만 *이고 나머지는 공백
		// 3. 세번째 줄, 끝에서 세번째 줄은 맨 처음과 끝에 *찍고 양 옆에 한칸 공백, 나머지 전부 *로 채움
		// 4. 네번째 줄, 끝에서 네번째 줄은 맨 처음과 끝에 *찍고 양 옆에 한칸 공백, 다음 *찍고 나머지 공백
		// 5. .... 계속 하면 가운데줄 (n*2-1 번째 줄)은 * * * * * * 모양
		
		/*
		* n:	1		2			3					4     
		* 
		*      *	*****		*********		*************				
		*           *   *       *       *       *           *
		*           * * *       * ***** *       * ********* *
		*           *   *       * *   * *       * *       * *
		*           *****       * * * * *       * * ***** * *
		*                       * *   * *       * * *   * * *
		*                       * ***** *       * * * * * * *
		*                       *       *       * * *   * * *
		*                       *********       * * ***** * *
		*                                       * *       * *
		*                                       * ********* *
		*                                       *           *
		*                                       *************
		*    1		2			     4                6             
		*                                       
		*/


		// 한 행의 개수 = 4n-3
		int n = 5;
		String [][] arr = new String[4*n-3][4*n-3];	

		// 2차원 배열 모든 요소를 공백으로 초기화
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}

		insertArr(arr, n);	// 별을 삽입하는 메서드
		printArr(arr);		// 2차원 배열을 출력하는 메서드


	}	// 메인메서드 끝
	
	// 배열에 *을 삽입할 메서드 선언(매개변수: arr배열, n)
	public static void insertArr(String[][] arr, int n ) {
		int line = 4*n-3;	


		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[0][j] = "*";	// 맨 첫 행은 전부 *
				arr[i][0] = "*";	// 모든 행의 0번째 열은 전부 *
				arr[i][arr.length-1] = "*";	// 모든 행의 마지막 열은 전부 *

//				i열 :	 0			2			4		6
//				j열 : [0]~[12] / [2]~[10] / [4]~[8] / [6]~[6]
				if(i%2==0 && j>=i && j<=arr.length-1-i) {
					arr[i][j] = "*";
				}

//				j열 : 	 0			2			4		
//				i열 : [0]~[12] / [2]~[10] / [4]~[8] /
				if(j%2==0 && (i>=j && i<=arr.length-1-j)) {
					arr[i][j] = "*";
				}

				if(i>2*n-2) {	// 배열의 중간 행부터는 복사	
					arr[i][j] = arr[arr.length-1-i][j];
				}

				if(j>2*n-2) {	// 배열의 중간 열부터는 복사
					arr[i][j] = arr[i][arr.length-1-j];
				}
			}
		}

	}
	
	// 배열을 출력하는 메서드
	public static void printArr(String[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}	// 클래스 끝












