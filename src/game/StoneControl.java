package game;
import java.util.ArrayList;

import dataConsole.myk.Coordinate;

public class StoneControl implements Runnable {
	public static int counter=0;//会记录一共生成了多少块石头
	public static int counterLive=0;
	Stone aStone;
	public static ArrayList<Stone> StoneList=new ArrayList<Stone>();
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(Game.result=="ing"){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

			//判断石头是否可以被创建，不可以则扔进垃圾箱
			ifStone();			
		}
		Coordinate.y=Coordinate.y+2;
	}
	
	//判断有无石头生成
	public void ifStone(){
		double a=Math.random();
		if(a<=0.5){
			
		}else{
			aStone=new Stone();
			counter++;
			counterLive++;
			StoneList.add(aStone);
			
			//石头的行为
			Thread aThread=new Thread(aStone);
			aThread.start();
			
			
		}
	}
	

	
	
	
	
}
