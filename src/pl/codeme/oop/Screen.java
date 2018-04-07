package pl.codeme.oop;

public class Screen {
	private Point screen[][];

	public Screen(int width, int height) { // konstruktor metoda bez typu
											// zwracanego, o nazwie klasy
		screen = new Point[height][width];

		for (int w = 0; w < screen.length; w++) {
			for (int h = 0; h < screen[w].length; h++) {
				screen[w][h] = new Point();
			}
		}

	}

	public void print() {
		for (int w = 0; w < screen.length; w++) {
			for (int h = 0; h < screen[w].length; h++) {
				System.out.print(screen[w][h].getMark());
			}
			System.out.println();

		}
	}

	public void draw(int x, int y, char ch) {
		screen[y][x].setMark(ch);
	}
	
	public void text(int x, int y, String text){
		for (int i = 0; i < text.length(); i++){
			screen[y][x + i].setMark(text.charAt(i));
		}
	}

	public void horizontalLine(int x, int y, int length){
		for (int i = 0; i < length; i++){
			screen[y][x + i].setMark('_');
		}
	}
	
	public void verticalLine(int x, int y, int length){
		for (int i = 0; i < length; i++){
			screen[y + i][x].setMark('|');
		}
	}
				
		// x1, y1 - wspolrzedne poczatkowego punku, x2, y2 - wspolrzedne koncowego punktu, ch - znak rysowania
	public void zwyklaLinia(int x1, int y1, int x2, int y2, char ch)
		{
		int di, dx, dy, xi, yi;
		int x = x1, y = y1;

		if (x1 < x2)
		{
		xi = 1;
		dx = x2 - x1;
		}
		else
		{
		xi = -1;
		dx = x1 - x2;
		}

		if (y1 < y2)
		{
		yi = 1;
		dy = y2 - y1;
		}
		else
		{
		yi = -1;
		dy = y1 - y2;
		}

		draw((int)x, (int)y, ch);

		// jesli osia wiodaca jest OX
		if (dx > dy)
		{
		di = dy * 2 - dx;

		while (x != x2)
		{
		if (di > 0)
		{
		x += xi;
		y += yi;
		di += (dy - dx) * 2;
		}
		else
		{
		di += 2 * dy;
		x += xi;
		}
		draw((int)x, (int)y, ch);
		}
		}

		// jesli osia wiodaca jest OY
		else
		{
		di = dx * 2 - dy;

		while (y != y2)
		{
		if (di > 0)
		{
		x += xi;
		y += yi;
		di += (dy - dx) * 2;
		}
		else
		{
		di += dx * 2;
		y += yi;
		}
		draw((int)x, (int)y, ch);
		}
		}
		}
	
	public void czworobokRys(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, char ch){
		zwyklaLinia(x1, y1, x2, y2, ch);
		zwyklaLinia(x2, y2, x3, y3, ch);
		zwyklaLinia(x3, y3, x4, y4, ch);
		zwyklaLinia(x4, y4, x1, y1, ch);
	}

}
