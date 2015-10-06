/*Singleton Pattern
 * 使用時機：
 * (1)想保證某個特定類別的物件個體絕對只有一個
 * (2)想在程式上表達出物件個體只會有一個時
 * Class應用:
 * Main-用三次 呼叫同一個class 但不管在何時何地呼叫 都只會產生一個
 * SingleObject-SingleObject使用static方法可取得唯一一個物件，
 *              也是因為使用static使得傳回的物件都為同一個。
 * */
package Singletone;
public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Start.");
		
		SingleObject so1 = SingleObject.getInstance();
		SingleObject so2 = SingleObject.getInstance();
		
		if(so1 == so2)
		{
			System.out.println("The same Instance object.");
		}
		else 
		{
			System.out.println("The Different Instance object.");
		}
		
		SingleObject so3 = SingleObject.getInstance();
		
		System.out.println("End");
	}

}
