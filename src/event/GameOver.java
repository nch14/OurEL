package event;

import java.awt.Image;

import javax.swing.ImageIcon;

import dataConsole.myk.Distance;
import interFace.Order;
import game.Game;
import game.Plane;
import game.Skin;

/*
 * true���ǻ����ŵ���˼
 * */
public class GameOver extends Event implements Runnable{
	int energy,armor;
	static String reason="what?"; //GameOver��ԭ��
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
			}else System.out.println("GameOver.getresult�쳣��");
			return false;
			}
		else return true;
	}
	public String getData(){   //����ԭ��
		return reason;
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
			
			if(!getResult()){
				System.out.println("Game Over!");
				Order.order(Distance.distance);
				Game.result="end";
				
			}
			reason=getData();			
		}
		//��Ϸ������
		if(Game.result.equals("end")){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			GameOver = new ImageIcon(Skin.skin[3]).getImage();
			Game.result="Game Over";
		}
	
	}	
}

