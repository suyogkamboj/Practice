package aspectJAnnotationAfterReturningAdvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {
	
	@AfterReturning(
			pointcut="execution(* Operation.*())",
			returning="result"
			)
	
	public void myAdvice(JoinPoint jp, Object result ) {
		System.out.println("Additional Concern");
		System.out.println("Method Signature "+ jp.getSignature());
		System.out.println("Result in advice "+ result);
		System.out.println("End of returning advice");
	}

}
