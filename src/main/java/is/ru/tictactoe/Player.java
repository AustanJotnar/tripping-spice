package is.ru.tictactoe;


public class Player 
{
	private int id;
	private String name;

	public Player(int playerId, String playerName)
	{
		this.id = playerId;
		this.name = playerName;
	}

	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}
}

