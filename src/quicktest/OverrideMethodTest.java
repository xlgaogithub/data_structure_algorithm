package quicktest;

public class OverrideMethodTest {
	public static void main(String[] args) {
		B b = new B();
		b.aMethod();
		
		A a = (A)b;
		a.aMethod();
	}
}

class A {
	void aMethod() {
		System.out.println("This is Class A");
	}
}

class B extends A {
	@Override
	void aMethod() {
		System.out.println("This is Class B");
	}		
}
