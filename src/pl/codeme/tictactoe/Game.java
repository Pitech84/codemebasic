package pl.codeme.tictactoe;

import pl.codeme.oop.io.Keyboard;
import pl.codeme.tictactoe.exception.TicTacToeFieldOccupiedException;
import pl.codeme.tictactoe.exception.TicTacToeOutOfBoardException;
import pl.codeme.tictactoe.exception.TicTacToePlayerSignException;

public class Game {

	public static void main(String[] args) {
		 Player[] players = playerImplementation();
//		initializeGame();

		// utworzyc obiekt gry TicTacToe
		GameConditions gameConditions = initializeGame();
		TicTacToe ttt = new TicTacToe(gameConditions, players, 3);
		for (int i=  0; i < gameConditions.getX()*gameConditions.getY(); i++) {
			System.out.println("Podaj strzal: x");
			Keyboard kb2 = new Keyboard(System.in);
			int x = kb2.readInt();
			System.out.println(x);
			System.out.println("Podaj strzal: y");
			int y = kb2.readInt();
			System.out.println(y);
			testPlay(ttt,x,y);
		}
		
		// zagrac kilka razy metoda play() i w debuggerze obserowac zmiany
		
		// spytac z klawiatury o rzeczy potrzebne do gry rzeczy

	}

	private static GameConditions initializeGame(){
		System.out.println("Podaj wielkość tablicy: x");
		Keyboard kb2 = new Keyboard(System.in);
		int x = kb2.readInt();
		System.out.println(x);
		System.out.println("Podaj wielkość tablicy: y");
		int y = kb2.readInt();
		System.out.println(y);
		return new GameConditions(x,y);//TicTacToe(x, y);
				
		
	}
	
	
	
	 private static Player[] playerImplementation(){
		 System.out.println("Podaj ilość graczy:");
			Keyboard kb1 = new Keyboard(System.in);
			int bla = kb1.readInt();
			Player[] players = new Player[bla];
			for (int i = 1; i <= bla; i++) {
				System.out.println("Podaj imie gracza " + i);
				String a = kb1.readLine();
				System.out.println(a);
				System.out.println("Podaj znak gracza " + i);
				char b = kb1.readLine1();
				System.out.println(b);
				try {
					players[i-1] = new Player(b, a);
				} catch (TicTacToePlayerSignException e) {
					e.printStackTrace();
					System.exit(0);

				}
			}
			return players;
	 }
	//
	// // utworzyc obiekty Player
	//
	//
	// try {
	// players[i] = new Player(b, a); // obaj chca X
	// } catch (TicTacToePlayerSignException e) {
	//
	// e.printStackTrace();
	// System.exit(0);
	// // przestaje wykonywac program, bez tego zobaczyl by ze obsluzylismy
	// // bledy i poszedl by dalej
	// }
	// }

	// }

	private static void testPlay(TicTacToe ttt, int x, int y) {
		System.out.println("Kolej gracza: " + ttt.whoseTurn().getName());
		System.out.println("Strzał: " + x + "x" + y);

		try {
			ttt.play(x, y);
			printBoard(ttt.getBoard());
		} catch (TicTacToeOutOfBoardException e) {
			System.out.println("Gracz" + e.getPlayer().getName()
					+ "Próbujesz strzelic poza planszę");
		} catch (TicTacToeFieldOccupiedException e) {
			System.out.println("To pole jest już zajęte");
		}
		System.out.println();
	}

	private static void printBoard(char[][] board) {
		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board.length; x++) {
				System.out.print(board[y][x]);
			}
			System.out.println();
		}
	}
}
