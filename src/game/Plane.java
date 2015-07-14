package game;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

import dataConsole.myk.*;

//plane类
public class Plane implements Runnable {

	public Coordinate myCoordinate;
	public Energy myEnergy;
	Distance myDistance;
	public  Armor myArmor;
	Civ myCiv;
	public static Image myShip;
	
	//构造方法、初始化
	public Plane(){
		myCoordinate=new Coordinate();
		myEnergy=new Energy();
		myShip = new ImageIcon(Skin.skin[1]).getImage();
		myDistance=new Distance();
		myArmor=new Armor();
		myCiv=new Civ();
		
		

		
		
	}
	
	
	@Override//RUN方法
	public void run() {
		// TODO 自动生成的方法存根
		
	}
	public  Rectangle getRect(){
		return new Rectangle(Coordinate.x,Coordinate.y,MyStatic.xPlane,MyStatic.xPlane);
	}
}
