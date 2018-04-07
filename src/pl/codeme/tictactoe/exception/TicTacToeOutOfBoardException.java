package pl.codeme.tictactoe.exception;

import pl.codeme.tictactoe.Player;

public class TicTacToeOutOfBoardException extends TicTacToeBoardException {

	private Player player;
	
	public TicTacToeOutOfBoardException(Player player) {
		super();
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

}
