package game;

import dataConsole.myk.Civ;
import dataConsole.myk.OtherCiv;

/*
 * 负责创建、管理其它文明
 */
public class OtherPlaneControl implements Runnable{
	Civ playerCiv;
	OtherCiv OC;

	public OtherPlaneControl(Civ myCiv) {
		// TODO 自动生成的构造函数存根
		this.playerCiv=myCiv;
	}

	public void run() {
		// TODO 自动生成的方法存根
		while(Game.result=="ing"){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			//生成一个文明实例
		if(Math.random()>0.92){
			OC=new OtherCiv(playerCiv.civ);
			Thread oc=new Thread(OC);
			oc.start();
		}
			
		}
	}
	
}
