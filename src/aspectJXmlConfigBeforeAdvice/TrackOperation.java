package aspectJXmlConfigBeforeAdvice;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	
	public void myAdvice(JoinPoint jp) {
		System.out.println("Additional concern");
		System.out.println("Method Signature "+ jp.getSignature() );
	}

}
