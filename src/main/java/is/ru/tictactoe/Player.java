package is.ru.tictactoe;


public class Player 
{
	private int id;
	private String name;
	private char token;

	public Player(int playerId)
	{
		this.id = playerId;
		this.setToken(playerId);
	}
	public Player(int playerId, String playerName)
	{
		this.id = playerId;
		this.name = playerName;
		this.setToken(playerId);
		
	}

	public void setToken(int playerId)
	{
		if(playerId == 0 )
		{
			this.token = 'X';
		}
		else if(playerId == 1)
		{
			this.token = 'O';
		}
	}
	public void setId(int playerId)
	{
		this.id = playerId;
	}
	public void setName(String playerName)
	{
		this.name = playerName;
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

