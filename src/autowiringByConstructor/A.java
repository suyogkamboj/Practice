package autowiringByConstructor;

public class A {
	B b;

	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor A");
	}

	public A(B b) {
		super();
		this.b = b;
	}
	
	void print() {
		System.out.println("print A");
	}
	
	void display() {
		print();
		b.print();
	}

}
