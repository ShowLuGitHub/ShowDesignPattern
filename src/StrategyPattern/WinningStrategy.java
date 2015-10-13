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
	
	//決定下一把要出什麼，如果上一把沒贏 就用random出下一把，如果贏了就直接傳上一把的值
	public Hand nextHand()
	{
		if(!won)
		{
			prevHand = Hand.getHand(random.nextInt(3));
		}
		
		return prevHand;
	}
	
	//直接呼叫這個方法 存上一把出什麼
	public void study(boolean win)
	{
		won = win;
	}

}
