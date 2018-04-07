package pl.codeme.tictactoe;

import java.util.HashSet;
import java.util.Set;

import pl.codeme.tictactoe.exception.TicTacToePlayerSignException;

public class Player {
	private char mark;
	private String name;
	private int score; // czy szybko stawia swoje znaki
	private static Set<Character> usedMarks = new HashSet<Character>(); 
	// bez static kazdy player ma swoja przesrzen dla Set
	public Player(char mark, String name) throws TicTacToePlayerSignException {
		super();
		if (usedMarks.contains(mark)) {
			throw new TicTacToePlayerSignException();
		}
		this.mark = mark;
		usedMarks.add(mark); // obiekt reprezentujacy typ prosty upakowany do
								// Charakter
		this.name = name;
		score = 0; // kazdy gracz wstępie dostaje 0 punktow

	}

	public void increaseScore(int amount) {
		score += amount;
	}

	public char getMark() {
		return mark;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}
