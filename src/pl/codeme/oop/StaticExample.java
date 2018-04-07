package pl.codeme.oop;

public class StaticExample {

	public static void main(String[] args) {
		
		System.out.println(StaticObj.b);

		StaticObj.staticMethod();
		
		StaticObj o1= new StaticObj(10);
		StaticObj o2= new StaticObj(20);
		StaticObj o3= new StaticObj(30);

		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		o1.a = 15;
		o2.a = 21;
		o3.b = 100; // b zmienna klasowa statyczna

		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		o3.staticMethod();
//				a=10 b=10
//				a=20 b=10
//				a=30 b=10
//				a=15 b=100
//				a=21 b=100
//				a=30 b=100

	}
}
// pola statyczne nie wymagają instatncji klasy