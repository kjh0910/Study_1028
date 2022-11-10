package week_3;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * <아이스 아메리카노>
		 * 
		 * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
		 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 
		 * 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * */
		
		
	}
	public static int[] solution(int money) {
        // 잔 수와 남은 돈을 담는 길이가 2인 배열 생성
		int[] answer = new int[2];
        
        answer[0] = money / 5500;	// 배열 index 0에 최대로 마실수 있는 잔 수를 저장
        answer[1] = money - (5500*answer[0]); // index 1에 남는 돈(money - 5500*잔 수(index[0])을 저장 
        
        
        return answer;
    }

	
}
