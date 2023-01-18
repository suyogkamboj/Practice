 package aspectJXmlConfigAfterReturningAdvice;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	
	public void myAdvice(JoinPoint jp, Object result) {
		System.out.println("Additional concern");
		System.out.println("Method Signature "+ jp.getSignature() );
		System.out.println("Result in advice "+result);
		System.out.println("end of after returning advice");
	}
}
