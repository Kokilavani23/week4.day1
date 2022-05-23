package week4.day1;

public class Bank extends SBI implements PNB,CIBIL {

	@Override
	public void cibilScore() {
		System.out.println("cibil Score");
		
	}

	@Override
	public void creditScore() {
		System.out.println("credit Score");
		
	}

	@Override
	public void minimumBalance() {
		System.out.println("minimum Balance");
		
	}

	@Override
	public void bankBalance() {
		System.out.println("bank Balance");
		
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		
	}

   public static void main(String[] args) {
	Bank obj=new Bank();
	obj.cibilScore();
	obj.creditScore();
	obj.minimumBalance();
	obj.bankBalance();
	obj.maximumLoanAmount();
	obj.ITLoan();
	
}

}
