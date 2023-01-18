package throwsAdviceSpringOld;

public class Validator {
	public void validate(int age)throws Exception {
		if(age < 18) 
			throw new ArithmeticException("Not a valid age");
		else
			System.out.println("vote confirmed");
	}

}
