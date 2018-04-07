package pl.codeme.oop;

public interface Radio { // interface lata nam brak mozliwosci dziedziczenia po
							// wielu klasach, dopisujemy sobie metody jakie
							// uwazamy ze sa nam konieczne zeby nasz samochod
							// stal sie radiem
	// Intefejsy mowia co musi byc zadeklarowane, nie są cześciowym rozwiązaniem
	// problem. W interfacach moga byc pola. Interfacy sluza do obkrajania
	// funkcjonalnosci
	final int MAX_VOLUME = 100;
	int volume = 10;

	public void radioOn();

	public void radioOff();

	public void setVolume(int volume);

}
