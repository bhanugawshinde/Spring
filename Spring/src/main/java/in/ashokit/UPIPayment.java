package in.ashokit;

public class UPIPayment implements IPayment {

	@Override
	public void pay(int amount) {
		System.out.println("UPI Payment done : "+amount);
	}

}
