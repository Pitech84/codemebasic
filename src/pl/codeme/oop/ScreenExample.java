package pl.codeme.oop;

public class ScreenExample {

	public static void main(String[] args) {
		Screen screen = new Screen(10, 10);
//		screen.draw(5,6, 'X');
//		screen.text(2, 2, "tom");
//		screen.horizontalLine(3, 3, 5);
//		screen.verticalLine(2, 4, 5);
//		screen.zwyklaLinia(1, 1, 9, 9, '*');
		screen.czworobokRys(1, 1, 1, 5, 5, 5, 5, 1, 'x');
		screen.print();
		
	}

}
