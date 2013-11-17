package is.ru.tictactoe;


public class Player 
{
	private int id;
	private String name;

	public Player(int playerId, String playerName){
		id = playerId;
		name = playerName;
	}

	public String getName(){
		return name;
	}
}

