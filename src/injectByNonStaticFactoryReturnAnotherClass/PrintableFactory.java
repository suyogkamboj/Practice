package injectByNonStaticFactoryReturnAnotherClass;

public class PrintableFactory {
	public Printable getPrintableFactory() {
		return new A();
	}
}
