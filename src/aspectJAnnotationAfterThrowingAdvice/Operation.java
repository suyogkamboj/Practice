package aspectJAnnotationAfterThrowingAdvice;

public class Operation {
	public void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("not valid vote");
		}else {
			System.out.println("valid age for voting");
		}
	}

}
