package game;

import dataConsole.myk.Civ;
import dataConsole.myk.OtherCiv;

/*
 * ���𴴽���������������
 */
public class OtherPlaneControl implements Runnable{
	Civ playerCiv;
	OtherCiv OC;

	public OtherPlaneControl(Civ myCiv) {
		// TODO �Զ����ɵĹ��캯�����
		this.playerCiv=myCiv;
	}

	public void run() {
		// TODO �Զ����ɵķ������
		while(Game.result=="ing"){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			//����һ������ʵ��
		if(Math.random()>0.92){
			OC=new OtherCiv(playerCiv.civ);
			Thread oc=new Thread(OC);
			oc.start();
		}
			
		}
	}
	
}
