package dataConsole.myk;

import game.Game;

public class Energy implements Runnable {
	public static int energy=10000000;     //��ʼȼ����1000
	public int nature(){
		energy-=3;
		return energy;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		
		while(Game.result.equals("ing")){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			nature();
		}
	}
}
