package injectionByStaticFactoryReturnAnotherClass;

public class PrintableFactory {
	public static Printable getPrintableFactory() {
		return new A(); //return anyone instance either A or B
	}

}
