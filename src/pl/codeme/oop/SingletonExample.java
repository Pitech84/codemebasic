package pl.codeme.oop;

public class SingletonExample {

	public static void main(String[] args) { // widoczna, wszedzie, (static) nie
												// trzeba
												// wywolywac instatncji zeby
												// byla widoczna, nic nie
												// zwraca, laduje tablice znakow
		Singleton singleton1, singleton2;
		// singleton = new Singleton(); // nie widoczny bo w klasie Singleton
		// zrobilismy konstruktor private
		singleton1 = Singleton.getInstance();
		singleton2 = Singleton.getInstance();
		System.out.println("Singleton 1" + singleton1.toString());
		System.out.println("Singleton 1" + singleton2.toString());


	}
}
