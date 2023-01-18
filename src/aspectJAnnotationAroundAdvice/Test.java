package aspectJAnnotationAroundAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("aspectJAnnotationAroundAdvice.xml");
		Operation o= (Operation) ac.getBean("op");
		
		System.out.println("calling msg... ");
		o.msg();
		System.out.println("calling display... ");
		o.display();
		

	}

}
