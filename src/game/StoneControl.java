package game;
import java.util.ArrayList;

import dataConsole.myk.Coordinate;

public class StoneControl implements Runnable {
	public static int counter=0;//���¼һ�������˶��ٿ�ʯͷ
	public static int counterLive=0;
	Stone aStone;
	public static ArrayList<Stone> StoneList=new ArrayList<Stone>();
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(Game.result=="ing"){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}

			//�ж�ʯͷ�Ƿ���Ա����������������ӽ�������
			ifStone();			
		}
		Coordinate.y=Coordinate.y+2;
	}
	
	//�ж�����ʯͷ����
	public void ifStone(){
		double a=Math.random();
		if(a<=0.5){
			
		}else{
			aStone=new Stone();
			counter++;
			counterLive++;
			StoneList.add(aStone);
			
			//ʯͷ����Ϊ
			Thread aThread=new Thread(aStone);
			aThread.start();
			
			
		}
	}
	

	
	
	
	
}
