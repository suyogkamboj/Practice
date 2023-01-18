package aspectJAnnotationBeforeAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("aspectJAnnotationBeforeAdvice.xml");
		Operation o=(Operation) ac.getBean("op");
		
		System.out.println("calling msg...");
		o.msg();
		
		System.out.println("calling m...");
		o.m();
		
		System.out.println("calling k...");
		o.k();
		
		/* 1st pointcut result -> all public method from operation class*/
//		calling msg...
//		additional concern
//		Method Signature void aspectJAnnotationBeforeAdvice.Operation.msg()
//		msg method invoked
//		calling m...
//		additional concern
//		Method Signature int aspectJAnnotationBeforeAdvice.Operation.m()
//		m method invoked
//		calling k...
//		additional concern
//		Method Signature int aspectJAnnotationBeforeAdvice.Operation.k()
//		k method invoked

		// 2nd pointcut result
//		calling msg...
//		additional concern
//		Method Signature void aspectJAnnotationBeforeAdvice.Operation.msg()
//		msg method invoked
//		calling m...
//		additional concern
//		Method Signature int aspectJAnnotationBeforeAdvice.Operation.m()
//		m method invoked
//		calling k...
//		k method invoked
	}

}
