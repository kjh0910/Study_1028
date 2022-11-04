package week2;

public class Ex9 {

	public static void main(String[] args) {
		
				/*
				 * 동호는 내년에 초등학교를 입학한다. 그래서 동호 어머니는 수학 선행 학습을 위해 
				 * 쉽게 푸는 문제를 동호에게 주었다.
				 * 이 문제는 다음과 같다. 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 
				 * 1 2 2 3 3 3 4 4 4 4 5 .. 이러한 수열을 만들고 
				 * 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.
				 * 하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자.
				 * 
				 * */
				int arr[] = new int[100];
				int index = 0;
				
//				1			i=1이면 1번 저장
//				2 2			i=2이면 2번 저장
//				3 3 3		i=3이면 3번 저장
//				4 4 4 4		i=4이면 4번 저장
				
				for(int i=1; i<=10; i++) {
					for(int j=1; j<=i; j++ ) {
						arr[index] = i;
						index++;
//						System.out.println("arr[i] = " + arr[i] + ", arr[j] = " +arr[j]);
					}
				}
				
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
//				int result = sum(arr, 3, 7);
//				System.out.println(result);
				sum(arr, 3, 7);
				
				
			}
			
			public static void sum(int[] arr, int A, int B) {
				int sum = 0;
				for(int i=A; i<=B; i++) {
					sum += arr[i-1]; 
					System.out.print(arr[i-1]);
				}
				System.out.println();
				System.out.println(sum);
//				sum -= arr[A-1];
				
//				return sum;
			} 
			

	}

}
