package pl.codeme.tictactoe;

import pl.codeme.tictactoe.exception.TicTacToeFieldOccupiedException;
import pl.codeme.tictactoe.exception.TicTacToeOutOfBoardException;

public class TicTacToe {

	private Field[][] board;

	private Player[] players;

	private int turn = 0;

	private int wins;

	public TicTacToe(GameConditions gameConditions, Player[] players, int wins) {
		this.players = players;
		this.wins = wins;
		int width = gameConditions.getX();
		int height = gameConditions.getY();

		board = new Field[height][width]; // musimy zainicjowac , stworzy sie
											// odpowiednia tablica z null
											// obiektami
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				board[y][x] = new Field(); // stworzenie obieltow field w kazdym
											// miejscu boarda

			}
		}
	}

	public Player whoseTurn() {
		return players[turn];

	}

	// public void play(int x, int y) throws TicTacToeOutOfBoardException,
	// TicTacToeFieldOccupiedException { //metoda ktora stawia punkt, sprawdza
	// czy nie wygral w tej turze
	// można zastąpic jednym throws TicTacToeBoardExcepttion bo dwa ponizsze dziedzicza po niej
	public void play(int x, int y) throws TicTacToeOutOfBoardException,
			TicTacToeFieldOccupiedException {
		if (y < 0 || y >= board.length || x < 0 || x >= board[0].length)
			throw new TicTacToeOutOfBoardException(whoseTurn()); // po zdefiniowaniu

		board[y][x].setPlayer(whoseTurn());

		nextPlayer();

		checkIsGameOver();
	}

	private void nextPlayer() { // mozna dac protected
		turn++;

		if (players.length <= turn) // sprawdzenie warunku czy wszyscy gracze
									// przeszli juz i powrot do pierwszego.
			turn = 0;
	}

	private void checkIsGameOver() {

	}
	
	char[][] getBoard() {
		char[][] res = new char[board.length][board[0].length];
		for (int y = 0; y < res.length; y++){
			for (int x = 0; x < res.length; x++){
				if (board[y][x].getPlayer() != null) { // dlatego musimy dac ten warunek bo get player nam daje gracza a normalnie jest null wiec bylby blad
					
					res[y][x] = board[y][x].getPlayer().getMark();
				} else {
					res[y][x] = '.';
				}
			}
		}
		return res;
//		return board.clone(); //trzeba klonowac bo mozna rozwalic tablice bo sie odniesie do referencji 
	}

}
