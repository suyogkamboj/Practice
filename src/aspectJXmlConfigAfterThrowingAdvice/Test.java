package aspectJXmlConfigAfterThrowingAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("aspectJXmlConfigAfterThrowingAdvice.xml");
		Operation o= (Operation) ac.getBean("opBean");
		
		System.out.println("calling validate");
		
		try {
			o.validate(12);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
