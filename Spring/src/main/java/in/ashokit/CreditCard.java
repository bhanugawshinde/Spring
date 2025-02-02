package in.ashokit;

public class CreditCard implements IPayment {

	@Override
	public void pay(int amount) {
		System.out.println("CreditCard Payment done : "+amount);
	}

}
