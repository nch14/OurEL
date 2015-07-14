package game;

import musicplayer.MusicPlayer;
import event.GameOver;
import event.HitStone;
import ui.*;
public class Game  {
	
	String time;//当前游戏时间
	public static String result="ing";//游戏结果
	GameOver gameResult;
	Plane me;
	Skin mySkin;
	public static FrameGame aFG;
	public static Thread aM;
	
	
	public void go() {
		
		//实例化皮肤
		mySkin=new Skin();
		
		//
		MusicPlayer aMusic=new MusicPlayer("sound/game.mp3");
		aM=new Thread(aMusic);
		aM.start();
		MusicPlayer.playMusic("");
				
		//创建我的飞机对象
		me=new Plane();
		Thread meGo=new Thread(me);
		meGo.start();
		
		//实现游戏图形界面
		aFG=new FrameGame(me);
		aFG.setVisible(true);
		Thread gameUI=new Thread(aFG);
		gameUI.start();
		
		//石头生成消亡管理
		StoneControl stoneControl=new StoneControl();
		Thread stoneThread=new Thread(stoneControl);
		stoneThread.start();
		
		//石头碰撞事件监测
		HitStone hitStone=new HitStone(me,  StoneControl.StoneList);
		Thread hitStoneFlash=new Thread(hitStone);
		hitStoneFlash.start();
		
		
		//文明值刷新
		Thread civReflash=new Thread(me.myCiv);
		System.out.println("wenming");
		civReflash.start();
		
		//里程值刷新
		Thread DistanceReflash=new Thread(me.myDistance);
		DistanceReflash.start();
			
		//燃料值刷新（不包括事件	
		Thread EnergyReflash=new Thread(me.myEnergy);
		EnergyReflash.start();
		
		//其他文明
		OtherPlaneControl oPC=new OtherPlaneControl(me.myCiv);
		Thread oPCThread=new Thread(oPC);
		oPCThread.start();
		
		//游戏结束的判断
		GameOver GameOverRun=new GameOver(me);
		Thread GameOver=new Thread(GameOverRun);
		GameOver.start();
		
		
		
		}
		
}
		

