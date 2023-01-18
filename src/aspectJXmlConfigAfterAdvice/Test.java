 package aspectJXmlConfigAfterAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("aspectJXmlConfigAfterAdvice.xml");
		Operation o=(Operation) ac.getBean("opBean");
		System.out.println("Calling msg...");
		o.msg();
		System.out.println("calling m...");
		o.m();
		System.out.println("calling k...");
		o.k();

	}

}
