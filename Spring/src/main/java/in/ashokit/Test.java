package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-bean.xml");
		BillPayment bean = context.getBean("billCollector", BillPayment.class);
		bean.payBill(1400);
	}
}
