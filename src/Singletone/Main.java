/*Singleton Pattern
 * �ϥήɾ��G
 * (1)�Q�O�ҬY�ӯS�w���O��������鵴��u���@��
 * (2)�Q�b�{���W��F�X�������u�|���@�Ӯ�
 * Class����:
 * Main-�ΤT�� �I�s�P�@��class �����ަb��ɦ�a�I�s ���u�|���ͤ@��
 * SingleObject-SingleObject�ϥ�static��k�i���o�ߤ@�@�Ӫ���A
 *              �]�O�]���ϥ�static�ϱo�Ǧ^�����󳣬��P�@�ӡC
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
