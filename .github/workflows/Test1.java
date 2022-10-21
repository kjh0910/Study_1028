package method;

/*
 * 은행계좌(Account) 클래스 정의
 * - 멤버변수 (단, 모든 멤버변수를 private 접근제한자로 선언)
 * 	1) 계좌번호(accountNo, "xxx-xxxx-xxx" = 문자열)
 * 	2) 예금주명(ownerName, "xxx" = 문자열)
 * 	3) 현재잔고(balance, XXXX = 정수)
 * - Getter / Setter 메서드 정의
 * */
class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// accountNo 에 대한 Getter 메서드 정의
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	
	// 입금기능 (deposit()) 메서드
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금할 금액: " + amount + "원");
		System.out.println("입금 후 현재잔고: " + balance + "원");
	}
}




public class Test1 {

	public static void main(String[] args) {

		Account acc = new Account();
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
//		acc.setBalance(100000);
		acc.deposit(10000);
		acc.deposit(30000);
		
		System.out.println("계좌번호: " + acc.getAccountNo());
		System.out.println("예금주명: " + acc.getOwnerName());
		System.out.println("현재잔고: " + acc.getBalance());
		
		
	}

}
