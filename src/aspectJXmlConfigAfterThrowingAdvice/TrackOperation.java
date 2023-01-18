package aspectJXmlConfigAfterThrowingAdvice;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	public void myAdvice(JoinPoint jp, Throwable error)// it is advice
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Exception is: " + error);
		System.out.println("end of after throwing advice...");
	}

}
