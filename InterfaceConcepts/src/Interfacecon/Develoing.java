package Interfacecon;

public class Develoing implements BankingClient{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Develoing d=new Develoing();
		d.paycreditcard();
		d.checkingbalance();
		BankingClient dr=new Develoing();

	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditcard");
		
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transferbalance");
		
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalance");
	}

}
