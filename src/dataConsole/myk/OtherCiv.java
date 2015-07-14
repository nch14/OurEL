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
	int playerCivValue;    //我方的文明值
	public static int playerChoose=1;
	public static Image itImage;//敌方文明的图片
	public static int otherCivExists=0;
	
	public OtherCiv(int playerCivValue){
		this.playerCivValue=playerCivValue;             //初始化玩家文明值
		itType=this.getType();//第0项是类型	
		itCivValue=this.getCiv();//第1项是文明值
		otherCivExists=1;
		itImage=new ImageIcon("graphics/外来文明.png").getImage();
		MusicPlayer.playMusic("sound/warning.mp3");
	}

	private int getType(){
		int type=0;//缺省是0,1是友好，2是中立，3是敌对
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
		System.out.println("生成了文明值是"+civ+"的文明。");
		return civ;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根

		//飞机出现
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
		//发生战争事件
		War aWar=new War(playerCivValue, itCivValue,playerChoose,itType);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		aWar=null;
		otherCivExists=0;
		playerChoose=1;
	}

}
