package oops;

public class ConstructorUse {
	String name;
	int age;
	String qualification;
	String Address;
	
	
	ConstructorUse(String n, int a,String q, String A){
       name = n;
       age = a;
       qualification = q;
       Address = A;
	};

	void detail() {
		
		System.out.println("My self "+ name);
		System.out.println("I am "+ age + " years old");
		System.out.println("I am "+ qualification);
		System.out.println("I am from "+ Address);
	}
	
	
	
	
	
	
	
	
	

}
