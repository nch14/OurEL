package event;
import game.*;

import java.util.ArrayList;

import musicplayer.MusicPlayer;
import dataConsole.myk.Armor;
import dataConsole.myk.Bullet;


public class HitStone extends Event implements Runnable{
	Plane myplane=null;
	ArrayList<Stone> stone =null;
	static int num=0;  //num表示撞到那一块石头对象在数组中的位置
	Boolean result=false;

	//获取两个对象
	public HitStone(Plane myplane,ArrayList<Stone> stone){
		this.myplane=myplane;
		this.stone=stone;
	}
	
	public boolean getResult() {
		
		return false;
	}
	

	public void hitCheck(){
		for(int i=0;i<stone.size();i++){		
			if(myplane.getRect().intersects(stone.get(i).getRect())){
				result=true;
				stone.remove(i);
			}
		}
	}
	
	
	public void BulletCheck(){
		for(int i=0;i<Bullet.bullet.size();i++){
			for(int j=0;j<stone.size()-1;j++){
				
					try {
						if(Bullet.bullet.get(i).getRect().intersects(stone.get(j).getRect())){
						stone.get(j).stoneArmor-=50;
						Bullet.bullet.remove(i);
						System.out.println("da dao le");
						if(stone.get(j).stoneArmor==0){
							stone.remove(j);
							MusicPlayer.playMusic("sound/boom.mp3");
						}
						}
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
						break;
					}
					
				}
				
			}
		}





	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(Game.result=="ing"){
			//每半秒做一次检查、是否碰撞
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			hitCheck();
			BulletCheck();
			//如果撞到了，那么减去200点护甲值
			while(result){
				Armor.Armor=Armor.Armor-200;
				MusicPlayer.playMusic("sound/boom.mp3");
				result=false;
				break;
			}
			
			
		}
	}

	@Override
	public String getData() {
		// TODO 自动生成的方法存根
		return null;
	}
}
