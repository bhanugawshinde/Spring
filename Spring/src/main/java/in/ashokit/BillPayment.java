package in.ashokit;

public class BillPayment {
	private IPayment iPayment;
	
	public BillPayment() {
		super();
	}


	public BillPayment(IPayment iPayment) {
		super();
		this.iPayment = iPayment;
	}

	public void setiPayment(IPayment iPayment) {
		this.iPayment = iPayment;
	}
	
	public void payBill(int amount) {
		System.out.println("Bill Payment Using -");
		iPayment.pay(amount);
	}
	
}
