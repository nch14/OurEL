package game;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import dataConsole.myk.MyStatic;

public class Stone implements Runnable{
	public int x=20;//ʯͷ���󶥵�����
	public int y=18;//ʯͷ���Ҷ�������
	public int stoneArmor=100;
	public Image aStoneImage;
	public Stone(){
		//num=StoneControl.StoneList.size();

		x=x+2*(int)(Math.random()*350);
		y=y+(int)(Math.random()*20);
		//n���ͼƬ��������һ��ʯͷ
		
		aStoneImage = new ImageIcon(StoneType()).getImage();

	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		
		//�˺�ʯͷ�Ѿ����˽���
		while(y<680){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			y=y+1;
		}
		StoneControl.StoneList.remove(this);

		
	}
	
	
	//������һ��ʯͷ
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
