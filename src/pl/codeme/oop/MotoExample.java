package pl.codeme.oop;

import javax.print.attribute.standard.MediaSize.Other;

public class MotoExample {

	public static void main(String[] args) {
		Vehicle vehicle1, vehicle2; // DEKFINICJA ZMIENNYCH TYPU Vehicle

		//vehicle1 = new Vehicle("Car"); // TWORZENIE 2 OBIEKTOW TEGO SAMEGO TYPU
		//vehicle2 = new Vehicle("Boat"); // TWORZENIE 2 OBIEKTOW TEGO SAMEGO TYPU

		// vehicle.type = "Car"; // okreslenie typu obiektu viehicle
		// otherVehicle.type = "Boat";

		//vehicle1.setType("Car");
		//vehicle2.setType("Boat");

//		vehicle2 = vehicle1; // zamordowanie obiektu Java sama posprząta jak
								// bedzie miala czas, nie musimy sie przejmowac
								// caschem
		// widac po alokacji w pamieci, wczesniej odnosza sie do roznych komorek
		// pamieci, po przypisaniu odnosza sie do tej samej

		// System.out.println("Vehicle: " + vehicle1.type + " " +
		// vehicle1.toString());
		// System.out.println("otherVehicle: " + vehicle2.type + " " +
		// vehicle2.toString());

//		System.out.println("Vehicle: " + vehicle1.getType() + " "
//				+ vehicle1.toString());
//		System.out.println("otherVehicle: " + vehicle2.getType() + " "
//				+ vehicle2.toString()); // zmiana na get type
		// zaby nei robic operacji bezposredniu na polu obiektu, uzywamy
		// gattersow i setterow
//		Car myCar = new Car(); // jezeli pierwsze Car bedzie Car to bedzie mail
								// wszystko z Car
		// jak damy Vehicle myCar = new Car(); to bedzie mail tylko to co
		// Vehicle, jak Object myCar to po Object
		// myCar.
		// nie taka akcje nazywamy rzutowaniem, rzutowanie w dol jest ok
		// Car->Vehicle ok, w druga strone nie ok
		Vehicle myCar = new Car();
		Radio myVehicle = new Car();

		//Vehicle myVehicle = new Vehicle("brr");

		Car yourCar; // to ze mozemy rzutowac i dziedzicza nazywamy
						// WIELOPOSTACJIOWOSCIA
		yourCar = (Car) myCar;
		//yourCar = (Car) myVehicle; // zrzutowanie takie wywali blad po
									// kompilacji ze rzutujemy nieleglnie, w
									// góre

	}

}
