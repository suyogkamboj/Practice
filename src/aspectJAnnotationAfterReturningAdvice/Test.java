package aspectJAnnotationAfterReturningAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("aspectJAnnotationAfterReturningAdvice.xml");
		Operation o= (Operation) ac.getBean("op");
		
		System.out.println("calling m... ");
		System.out.println(o.m());
		System.out.println("calling k... ");
		System.out.println(o.k());

	}

}
