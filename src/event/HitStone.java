package event;
import game.*;

import java.util.ArrayList;

import musicplayer.MusicPlayer;
import dataConsole.myk.Armor;
import dataConsole.myk.Bullet;


public class HitStone extends Event implements Runnable{
	Plane myplane=null;
	ArrayList<Stone> stone =null;
	static int num=0;  //num��ʾײ����һ��ʯͷ�����������е�λ��
	Boolean result=false;

	//��ȡ��������
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
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
						break;
					}
					
				}
				
			}
		}





	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(Game.result=="ing"){
			//ÿ������һ�μ�顢�Ƿ���ײ
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			hitCheck();
			BulletCheck();
			//���ײ���ˣ���ô��ȥ200�㻤��ֵ
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
		// TODO �Զ����ɵķ������
		return null;
	}
}
