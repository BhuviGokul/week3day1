package week3day1;

public class AxisBank extends BankInfo{

public void deposite(int a, int b) {
		
		System.out.println("Deposited amount is 7000");
		
	}
public static void main(String[] args) {
	
	BankInfo bk=new BankInfo();
	bk.saving();
	
	BankInfo bk1=new BankInfo();
	bk1.fixed();
	
	BankInfo bk2=new BankInfo();
	bk2.deposite(0, 0);
}

}
