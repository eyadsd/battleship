package battleShipGame;

import java.io.Serializable;

public class Coordinates implements Serializable{

	private static final long serialVersionUID = 1L;
	public int x;
	public int y;
	
	public Coordinates(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

}
