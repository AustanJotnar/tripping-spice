package is.ru.tictactoe;


public class Player 
{
	private int id;
	private String name;
	private char token;

	public Player(int playerId, String playerName)
	{
		this.id = playerId;
		this.name = playerName;
		if(playerId == 0)
		{
			this.token = 'X';
		}
		else if(playerId == 1)
		{
			this.token = 'O';
		}
	}

	public String getName()
	{
		return this.name;
	}

	public int getId()
	{
		return this.id;
	}
	public char getToken()
	{
		return this.token;
	}
}

