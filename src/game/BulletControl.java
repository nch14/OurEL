package game;

import dataConsole.myk.Bullet;

public class BulletControl {
	int x;
	public BulletControl(int type){
		x=type;
	}
	
	public void BulletConsole(){
		for(int i=0;i<x;i++){
			Bullet aBullet =new Bullet(x,i);
			Thread aThread=new Thread(aBullet);
			aThread.start();
		}
	}
}