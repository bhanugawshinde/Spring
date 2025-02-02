package in.ashokit;

public class DebitCard implements IPayment {

	@Override
	public void pay(int amount) {
		System.out.println("DebitCard payment : " + amount);
	}

}
