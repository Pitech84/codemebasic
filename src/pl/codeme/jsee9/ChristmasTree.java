package pl.codeme.jsee9;

public class ChristmasTree {

	public static void main(String[] args) {
//		drawTree(12);
//		if (warunek){
//		}
//		else
//		{
//		}
//		else if (warunek2){
//		}
//		
	}
		
			
	public static void drawTree (int height){
		
		int x, y;
		
		for (y = 1; y <= height; y++){
			for (x = 1; x <= y ; x++){
				if (x == y){
				System.out.print('*');
				}
				System.out.print(' ');
			}
			
			System.out.println();
		}
	
		

	}

}
