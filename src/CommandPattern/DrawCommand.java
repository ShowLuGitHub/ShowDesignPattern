package CommandPattern;


import java.awt.Point;
//import Command.Event.Command;

public class DrawCommand implements Command 
{
	protected Drawable drawable;
	
	private Point position;
	
	public DrawCommand(Drawable drawable, Point position)
	{
		this.drawable = drawable;
		this.position = position;
	}
	
	public void excute()
	{
		drawable.draw(position.x, position.y);
	}



}
