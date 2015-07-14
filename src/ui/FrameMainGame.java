package ui;

import game.Game;
import game.Plane;
import game.Skin;
import game.StoneControl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import dataConsole.myk.Armor;
import dataConsole.myk.Bullet;
import dataConsole.myk.MyStatic;
import dataConsole.myk.OtherCiv;

public class FrameMainGame extends Frame{
	int x;
	int y;
	Plane aPlane;
	public FrameMainGame(int x, int y, int w, int h,Plane plane) {
		super(x, y, w, h);
		aPlane=plane;
		
	}
	public void paint(Graphics g){
		this.createFrame(g);
		
		//画我方飞机
		g.drawImage(Plane.myShip,aPlane.myCoordinate.x,aPlane.myCoordinate.y,MyStatic.xPlane,MyStatic.yPlane,null);
		g.drawImage(new ImageIcon(Skin.skin[5]).getImage(),aPlane.myCoordinate.x+5,aPlane.myCoordinate.y+MyStatic.yPlane,MyStatic.xPlane-10,MyStatic.yPlane,null);
		
		//画我方血槽
		double a=Armor.Armor;
		g.setColor(Color.red);
		g.fillRect(24, 24, (int)(650*(a/1000)), 20);
		g.setColor(Color.black);
		g.draw3DRect(24, 24, 650, 20, true);
		
		
		//画石头
		for(int i=0;i<StoneControl.StoneList.size();i++){
			g.drawImage(StoneControl.StoneList.get(i).aStoneImage, this.x+StoneControl.StoneList.get(i).x,this.y+StoneControl.StoneList.get(i).y,MyStatic.xStone,MyStatic.yStone,null);
		}
		
		//画敌方文明
		for(int j=0;j<OtherCiv.otherCivExists;j++){
			g.drawImage(OtherCiv.itImage, this.x+20,this.y+20,70,70,null);
		}
		
		//画子弹
		for(int i=0;i<Bullet.bullet.size();i++){
			g.drawImage(Bullet.myBullet, (int)Bullet.bullet.get(i).x,(int)Bullet.bullet.get(i).y,MyStatic.xBullet,MyStatic.yBullet,null);
		}
		
		//GameOver
		if(Game.result.equals("Game Over")){
			g.drawImage(new ImageIcon("graphics/gameover.png").getImage(), 100, 120, 500, 300, null);
		}
		
	}
}
