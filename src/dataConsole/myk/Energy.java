package dataConsole.myk;

import game.Game;

public class Energy implements Runnable {
	public static int energy=10000000;     //初始燃料是1000
	public int nature(){
		energy-=3;
		return energy;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
		while(Game.result.equals("ing")){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			nature();
		}
	}
}
