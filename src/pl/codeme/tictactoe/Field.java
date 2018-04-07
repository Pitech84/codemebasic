package pl.codeme.tictactoe;

import pl.codeme.tictactoe.exception.TicTacToeFieldOccupiedException;

public class Field {
	private Player player; // nie wywolalismy tego pola i nic mu nie dalismy to jest null

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) throws TicTacToeFieldOccupiedException {
		if (this.player != null)
			throw new TicTacToeFieldOccupiedException();
		this.player = player;
		
		
	}


}
