package dataConsole.myk;

import game.Game;


/*
 * 随着时间增加的分数
 * */
public class Distance implements Runnable {
	public static int distance;
	
	//构造方法、实现每次调用游戏都会初始化里程
	public Distance(){
		distance=0;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(Game.result.equals("ing")){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			distance+=13;
			//System.out.println("里程增加"+distance);
		}
	}
	
}
