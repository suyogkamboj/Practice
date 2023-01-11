package injectByNonStaticFactoryReturnAnotherClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("injectByNonStaticFactoryAnotherClass.xml");
		Printable p=(Printable)c.getBean("p");
		p.print();

	}

}
