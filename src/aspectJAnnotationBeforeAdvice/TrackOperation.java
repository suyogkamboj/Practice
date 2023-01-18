package aspectJAnnotationBeforeAdvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	
//	@Pointcut("execution(* Operation.*(..))") 
	@Pointcut("execution(* Operation.m*(..))") // all public method whos name start with m from operation class
	public void k() {}   // ==> pointcut name
	
	@Before("k()") // applying pointcut before advice
	public void myadvice(JoinPoint jp) { // it is advice -> before advice
		System.out.println("additional concern");
		System.out.println("Method Signature " + jp.getSignature());	
	}
}
