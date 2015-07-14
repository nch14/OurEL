package game;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import dataConsole.myk.MyStatic;

public class Stone implements Runnable{
	public int x=20;//石头的左顶点坐标
	public int y=18;//石头的右顶点坐标
	public int stoneArmor=100;
	public Image aStoneImage;
	public Stone(){
		//num=StoneControl.StoneList.size();

		x=x+2*(int)(Math.random()*350);
		y=y+(int)(Math.random()*20);
		//n标记图片名、即哪一种石头
		
		aStoneImage = new ImageIcon(StoneType()).getImage();

	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
		//此后石头已经出了界面
		while(y<680){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			y=y+1;
		}
		StoneControl.StoneList.remove(this);

		
	}
	
	
	//生成哪一种石头
	public String StoneType(){
		String result="";
		int i=(int)((Math.random()+0.5)*4);

		switch(i){
		case 0:
			result="graphics/planet1.png";
			break;
		case 1:
			result="graphics/planet2.png";
			break;
		case 2:
			result="graphics/planet3.png";
			break;
		case 3:
			result="graphics/planet4.png";
			break;
		case 4:
			result="graphics/planet5.png";
			break;
		case 5:
			result="graphics/planet6.png";
		}
		return result;
	}
	public  Rectangle getRect(){
		return new Rectangle(x,y,MyStatic.xStone,MyStatic.xStone);
	}
}
