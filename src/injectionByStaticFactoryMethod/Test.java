package injectionByStaticFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("injectionByStaticFactory.xml");
		A a=(A) c.getBean("a");
		a.msg();

	}

}
