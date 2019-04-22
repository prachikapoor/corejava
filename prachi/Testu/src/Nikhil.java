
public class Nikhil{
	public static void main(String[] args){
		//Important : B is extending A, only m2 is overriden methods.
		// case1
		/*A a = new A();
		a.m1(); // m1 method present in A
		a.m2(); // m2 method present in A*/
			
		// case2
	/*	B b = new B();
		b.m1();   //m1 method available to B due to inheritance
		b.m2();  //m2 method present in B*/
		
		//case3
		A a = new B();   //parent ref holding child object
		a.m1();          //m1 method available parent is invoked
		a.m2();			 //as m2 is overriden resolution done by JVM
						 //resolution by JVM done only against object type i.e. new B() and not against reference type i.e. A a
		
}
	
}
	
class A{
	public static void m1(){
		System.out.println("A->m1");
	}
	public static void m2(){
		System.out.println("A->m2");
	}
}
class B extends A{
	public static void m2(){
		System.out.println("B->m2");
	}
}


