package CommandPattern;


import java.util.Iterator;
import java.util.Stack;


public class MacroCommand 
{
	//命令的集合
	private Stack commands = new Stack();
	
	//執行
	public void execute()
	{
		Iterator it = commands.iterator();
	}
	
	//新增
	public void append(Command cmd)
	{
		if(cmd != this)
		{
			commands.push(cmd);
		}
	}
	
	//刪除最後一個命令
	public void undo()
	{
		if(!commands.empty())
		{
			commands.pop();
		}
	}
	
	//全部刪除
	public void clear()
	{
		commands.clear();
	}

}
