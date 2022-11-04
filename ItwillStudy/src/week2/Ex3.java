package week2;

public class Ex3 {

	public static void main(String[] args) {
		/* <최빈값 구하기>
		 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 
		 * 최빈값을 return 하도록 solution 함수를 완성해보세요. 
		 * 최빈값이 여러 개면 -1을 return 합니다.
		 * 
		 * */
	}

}

class Solution3 {
    public int solution(int[] array) {
        
    	// array배열 각 요소의 개수를 저장할 count배열 생성하고
    	// 배열의 길이를 충분히 정함 (ArrayIndexOutOfBounds에러가 계속 생겨서..)
		int[] count = new int[1000];
		
		
		// for문 사용해서 array배열의 각 요소의 값을 count배열의 인덱스에 저장함
		// (예 int[] array = {1, 2, 3, 3} 이면, int[] count = {0, 1, 1, 2, 0, 0, 0 , 0 ..... }; 이 저장됨
		for(int i=0; i<array.length; i++) {
			count[array[i]]++;
		}
		
		// count배열에서 가장 값이 큰 요소를 저장할 변수 num선언 후 초기화
		// count배열에서 num의 인덱스(array 배열의 최빈값)를 저장할 변수 index 선언 후 초기화 
		int num = count[0];
		int index = 0;
		
		// for문을 사용해서 count배열에서 가장 큰 값을 변수 num에 저장하고 그 인덱스를 변수 index에 저장
		for(int i=0; i<count.length; i++) {
			if(num < count[i]) {
				num = count[i];
				index = i;
			} 
			
		}
		
		// if문을 사용해서 최빈값이 여러개일 경우가 있는지 판단하기
		// count배열의 모든 요소에 접근해서 판단해야 하므로 for문 사용해서 if문을 감싸기
		// 최빈값이 저장된 num과 같은 수가 있는지 비교함 => true이면 변수 index에 -1 저장
		// 이때, 변수 index와 자기자신을 비교하지 않아야 하므로 자기자신을 만나면 continue문으로 다음 for문으로(i++) 넘어감
        for(int i=0; i<count.length; i++) {
			if(index == i) {	
				continue;
			} else if(num == count[i]) {
				index = -1;
			}
			
		}
        
        return index;
    }
}