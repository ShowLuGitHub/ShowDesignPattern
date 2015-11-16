package Template;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractDisplay disp1 = new CharDisplay('H');
		AbstractDisplay disp2 = new StringDisplay("Hello World.");
		AbstractDisplay disp3 = new StringDisplay("±z¦n¡C");
		
		disp1.display();
		disp2.display();
		disp3.display();
		
		

	}

}
