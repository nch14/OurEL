package game;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

import dataConsole.myk.*;

//plane��
public class Plane implements Runnable {

	public Coordinate myCoordinate;
	public Energy myEnergy;
	Distance myDistance;
	public  Armor myArmor;
	Civ myCiv;
	public static Image myShip;
	
	//���췽������ʼ��
	public Plane(){
		myCoordinate=new Coordinate();
		myEnergy=new Energy();
		myShip = new ImageIcon(Skin.skin[1]).getImage();
		myDistance=new Distance();
		myArmor=new Armor();
		myCiv=new Civ();
		
		

		
		
	}
	
	
	@Override//RUN����
	public void run() {
		// TODO �Զ����ɵķ������
		
	}
	public  Rectangle getRect(){
		return new Rectangle(Coordinate.x,Coordinate.y,MyStatic.xPlane,MyStatic.xPlane);
	}
}
