package dataConsole.myk;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

import musicplayer.MusicPlayer;
import event.War;
import game.Plane;
/*
 * 
 */
 
public class OtherCiv implements Runnable{

	int itType=0;
	int itCivValue;			//
	int playerCivValue;    //�ҷ�������ֵ
	public static int playerChoose=1;
	public static Image itImage;//�з�������ͼƬ
	public static int otherCivExists=0;
	
	public OtherCiv(int playerCivValue){
		this.playerCivValue=playerCivValue;             //��ʼ���������ֵ
		itType=this.getType();//��0��������	
		itCivValue=this.getCiv();//��1��������ֵ
		otherCivExists=1;
		itImage=new ImageIcon("graphics/��������.png").getImage();
		MusicPlayer.playMusic("sound/warning.mp3");
	}

	private int getType(){
		int type=0;//ȱʡ��0,1���Ѻã�2��������3�ǵж�
		type=new Random().nextInt(3)+1;
		return type;
	}
	
	private String CivType(){
		
		return"";
	}

	private int getCiv(){   
		int civ=1;
		int random1;
		random1 = (int) Math.random()*9;
		if(random1>=0&&random1<=6)
			civ=(int) (playerCivValue*0.8*(Math.random()+0.5));
		else if(random1==7&&random1==8)
			civ=(int) (playerCivValue*(Math.random()+0.5));
		else if(random1==9)
			civ=(int) (playerCivValue*1.5*(Math.random()+1));
		System.out.println(playerCivValue);
		System.out.println("����������ֵ��"+civ+"��������");
		return civ;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������

		//�ɻ�����
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
		
		//����ս���¼�
		War aWar=new War(playerCivValue, itCivValue,playerChoose,itType);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		aWar=null;
		otherCivExists=0;
		playerChoose=1;
	}

}
