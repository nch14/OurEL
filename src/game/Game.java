package game;

import musicplayer.MusicPlayer;
import event.GameOver;
import event.HitStone;
import ui.*;
public class Game  {
	
	String time;//��ǰ��Ϸʱ��
	public static String result="ing";//��Ϸ���
	GameOver gameResult;
	Plane me;
	Skin mySkin;
	public static FrameGame aFG;
	public static Thread aM;
	
	
	public void go() {
		
		//ʵ����Ƥ��
		mySkin=new Skin();
		
		//
		MusicPlayer aMusic=new MusicPlayer("sound/game.mp3");
		aM=new Thread(aMusic);
		aM.start();
		MusicPlayer.playMusic("");
				
		//�����ҵķɻ�����
		me=new Plane();
		Thread meGo=new Thread(me);
		meGo.start();
		
		//ʵ����Ϸͼ�ν���
		aFG=new FrameGame(me);
		aFG.setVisible(true);
		Thread gameUI=new Thread(aFG);
		gameUI.start();
		
		//ʯͷ������������
		StoneControl stoneControl=new StoneControl();
		Thread stoneThread=new Thread(stoneControl);
		stoneThread.start();
		
		//ʯͷ��ײ�¼����
		HitStone hitStone=new HitStone(me,  StoneControl.StoneList);
		Thread hitStoneFlash=new Thread(hitStone);
		hitStoneFlash.start();
		
		
		//����ֵˢ��
		Thread civReflash=new Thread(me.myCiv);
		System.out.println("wenming");
		civReflash.start();
		
		//���ֵˢ��
		Thread DistanceReflash=new Thread(me.myDistance);
		DistanceReflash.start();
			
		//ȼ��ֵˢ�£��������¼�	
		Thread EnergyReflash=new Thread(me.myEnergy);
		EnergyReflash.start();
		
		//��������
		OtherPlaneControl oPC=new OtherPlaneControl(me.myCiv);
		Thread oPCThread=new Thread(oPC);
		oPCThread.start();
		
		//��Ϸ�������ж�
		GameOver GameOverRun=new GameOver(me);
		Thread GameOver=new Thread(GameOverRun);
		GameOver.start();
		
		
		
		}
		
}
		

