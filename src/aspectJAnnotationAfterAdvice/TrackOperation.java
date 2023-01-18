package aspectJAnnotationAfterAdvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	
	@Pointcut("execution(* Operation.*(..))")
	public void k() {}
	
	@After("k()")
	public void myAdvice(JoinPoint jp) {
		System.out.println("additional concern");  
        System.out.println("Method Signature: "  + jp.getSignature()); 
	}

}
