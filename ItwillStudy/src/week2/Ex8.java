package week2;

public class Ex8 {

	public static void main(String[] args) {
		/* <배열의 평균값>
		 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 
		 * solution 함수를 완성해주세요.
		 * */
		
		double avg = (double)100 /3;
		System.out.println(avg);
	}

}


class Solution8 {
    public double solution(int[] numbers) {
    	
    	// 평균값 = 합계 / n 이므로 
    	// 합계를 저장할 변수 sum, 평균을 저장할 변수 avg를 선언 후 0으로 초기화
    	// 이때, 평균은 소숫점자리까지 구해질 수 있으므로 double타입으로 선언
        int sum = 0;
        double avg = 0;
        
        // for문으로 배열의 모든 요소에 접근해서 변수 sum에 누적
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            
        }
        
       // (int)sum / (int)배열길이 = (int) 타입이 되므로 
       // 둘 중 하나를 (double)타입으로 형변환 후에 연산해야 평균값이 double타입으로 구해짐 
        avg = (double)sum/numbers.length;
        
        return avg;
    }
}