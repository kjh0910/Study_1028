package week2;

public class Ex4 {

	public static void main(String[] args) {
		/* <짝수는 싫어요>
		 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 
		 * return하도록 solution 함수를 완성해주세요.
		 * 
		 * n	result
		 * 10	[1, 3, 5, 7, 9]
		 * 15	[1, 3, 5, 7, 9, 11, 13, 15]
		 * 
		 * */
		
		
	}

}


class Solution4 {
    public int[] solution(int n) {
    	// n이하의 변수를 저장할 int타입 배열 선언
    	int[] arr;
		
    	// n이 짝수일 경우와 홀수일 경우 생성되는 배열의 길이가 달라져서 if문으로 배열길이 생성
		if(n%2==0) {
			arr = new int[n/2];
		} else {
			arr = new int[n/2+1];
		}
		
		// 배열의 인덱스를 구하기 위한 index 변수 선언 후 0으로 초기화
    	int index = 0;
    	
    	// for문으로 1부터 n이하의 모든 수에 접근함
    	// if문으로 홀수인지 판단 -> true일 경우 arr변수에 n을 저장, index값을 1증가 시킴
    	for(int i=1; i<=n; i++) {
    		if(i % 2 != 0) {
    			arr[index] = i;
    			index++;
    		}
    	}
        return arr;
    }
}