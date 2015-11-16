package Template;

public class CharDisplay extends AbstractDisplay {

	
	private char ch;
	
	public CharDisplay(char ch){
		this.ch = ch;
	}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("<<");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(ch);
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(">>");
		
	}

}
