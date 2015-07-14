package event;

import java.awt.Image;

import javax.swing.ImageIcon;

import dataConsole.myk.Distance;
import interFace.Order;
import game.Game;
import game.Plane;
import game.Skin;

/*
 * true就是还活着的意思
 * */
public class GameOver extends Event implements Runnable{
	int energy,armor;
	static String reason="what?"; //GameOver的原因
	Plane targetPlane;
	public static Image GameOver;
	
	
	public GameOver(Plane aPlane) {
		targetPlane=aPlane;
	}
	
	@Override
	public boolean getResult() {
		energy=targetPlane.myEnergy.energy;
		armor=targetPlane.myArmor.Armor;
		if(energy<=0||armor<=0){
			if(energy<=0){
				reason="energy";
			}else if(armor<=0){
				reason="armor";
			}else System.out.println("GameOver.getresult异常！");
			return false;
			}
		else return true;
	}
	public String getData(){   //返回原因
		return reason;
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
			
			if(!getResult()){
				System.out.println("Game Over!");
				Order.order(Distance.distance);
				Game.result="end";
				
			}
			reason=getData();			
		}
		//游戏结束后
		if(Game.result.equals("end")){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			GameOver = new ImageIcon(Skin.skin[3]).getImage();
			Game.result="Game Over";
		}
	
	}	
}

