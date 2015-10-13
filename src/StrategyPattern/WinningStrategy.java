package StrategyPattern;

import java.util.Random;

public class WinningStrategy implements Strategy {
	
	private Random random;
	private boolean won = false;
	private Hand prevHand;
	
	public WinningStrategy(int seed)
	{
		random = new Random(seed);
	}
	
	//�M�w�U�@��n�X����A�p�G�W�@��SĹ �N��random�X�U�@��A�p�GĹ�F�N�����ǤW�@�⪺��
	public Hand nextHand()
	{
		if(!won)
		{
			prevHand = Hand.getHand(random.nextInt(3));
		}
		
		return prevHand;
	}
	
	//�����I�s�o�Ӥ�k �s�W�@��X����
	public void study(boolean win)
	{
		won = win;
	}

}
