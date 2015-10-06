package Singletone;
public class SingleObject 
{
	private static SingleObject singleobject = new SingleObject();
	
	private SingleObject()
	{
		System.out.println("Start Instance");
	}

	public static SingleObject getInstance()
	{
		return singleobject;
	}
}
