package dataConsole.myk;

import game.Game;
import game.Skin;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/*
 * �ӵ��в�ͬ���ͣ���ͬ�ӵ��в�ͬ�Ĺ����������Ӻ�Ч��
 * ÿ���ӵ���������ҵ�����ֵ
 */

public class Bullet implements Runnable {
	public static Image myBullet;
	public double x;
	public double y;
	public static ArrayList<Bullet> bullet=new ArrayList<Bullet>();

	public Bullet(int Type,int index){
		y=Coordinate.y-MyStatic.yBullet-2;
		if(Type==1){
			x=Coordinate.x+(int)(0.5*MyStatic.xPlane);		
		}
		if(Type==2&&index==0){
			x=Coordinate.x+(int)(0.5*MyStatic.xPlane)-3;	
		}
		if(Type==2&&index==1){
			x=Coordinate.x+(int)(0.5*MyStatic.xPlane)+3;	
		}
		if(Type==3&&index==0){
			x=Coordinate.x+(int)(0.5*MyStatic.xPlane)-5;	
		}
		if(Type==3&&index==1){
			x=Coordinate.x+(int)(0.5*MyStatic.xPlane);	
		}
		if(Type==3&&index==2){
			x=Coordinate.x+(int)(0.5*MyStatic.xPlane)+5;	
		}
		myBullet=new ImageIcon(Skin.skin[2]).getImage();
		bullet.add(this);
		Energy.energy-=10;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(Game.result.equals("ing")){
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			y=y-5;
			if(y<25){
				bullet.remove(this);
			}
		}
	}
	
	
	public  Rectangle getRect(){
		return new Rectangle((int)x,(int)y,MyStatic.xBullet,MyStatic.xBullet);
	}
}
