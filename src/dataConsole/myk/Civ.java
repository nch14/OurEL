package dataConsole.myk;
import game.*;
/*
 * 
 * */
public class Civ implements Runnable {
	public static int civ;//��ʼ����ֵ��100
	
	//���췽����ʵ��ÿ�ε�����Ϸ�����ʼ������ֵ
	public Civ(){
		civ=100;
	}
	
	//�Ƽ���������
	public int nature(){
		civ+=2;
		return civ;
	}

	 //�Ƽ���ը����20%
	void civBoom(){   
		civ=(int)(civ*1.2);
	}
	
	
	//ÿ������һ������ֵ�ı䣬�����Ƽ���ը�ĸ���Ϊ2%
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(Game.result.equals("ing")){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			nature();
			if(Math.random()>0.98){
				civBoom();
			}
		}
	}
}
