package week_5;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * <개미 군단>
		 * 개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다. 
		 * 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다. 
		 * 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 
		 * 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다. 
		 * 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 
		 * 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 
		 * */
		
		System.out.println(solution(999));


}

	public static int solution(int hp) {
		int answer = 0;
		
		// 개미군단 공격력을 int배열 변수에 담음
		int[] power = {5, 3, 1};

		// while 반복문 사용하기 위해 index 선언 후 0으로 초기화 
		int i = 0;

		// hp가 0이 될때까지 반복함
		// answer에 hp를 power배열 첫번째부터 마지막까지 나눈 몫을 누적
		// hp의 값을 power배열 요소로 나눈 나머지를 저장
		while(hp>0) {
			answer += hp / power[i];
			hp %= power[i];
			i++;
		}

		return answer;
	}

}



























