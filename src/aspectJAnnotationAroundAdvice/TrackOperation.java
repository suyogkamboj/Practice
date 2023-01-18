package aspectJAnnotationAroundAdvice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	
	@Pointcut("execution(* Operation.*())")
	public void k() {}
	
	@Around("k()")
	public Object myAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Additional concern before calling actual method");
		Object obj=pjp.proceed();
		System.out.println("Additional concern after calling actual method");
		return obj;
	}
}
