package dataConsole.myk;
import game.*;
/*
 * 
 * */
public class Civ implements Runnable {
	public static int civ;//初始文明值是100
	
	//构造方法、实现每次调用游戏都会初始化文明值
	public Civ(){
		civ=100;
	}
	
	//科技增长函数
	public int nature(){
		civ+=2;
		return civ;
	}

	 //科技爆炸增加20%
	void civBoom(){   
		civ=(int)(civ*1.2);
	}
	
	
	//每秒钟做一次文明值改变，发生科技爆炸的概率为2%
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
			if(Math.random()>0.98){
				civBoom();
			}
		}
	}
}
