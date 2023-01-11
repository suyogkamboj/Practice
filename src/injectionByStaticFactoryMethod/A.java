package injectionByStaticFactoryMethod;

public class A {
	private static final A a=new A();
	private A() {
		System.out.println("Private Constructor");
	}
	
	public static A getA() {
		System.out.println("Factory method");
		return a;
	}
	
	public void msg() {
		System.out.println("hello A");
	}

}
