package aspectJXmlConfigAroundAdvice;

import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation {
	public Object myAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("additional concern before advice");
		Object obj=pjp.proceed();
		System.out.println("additional concern after advice ");
		return obj;
	}

}
