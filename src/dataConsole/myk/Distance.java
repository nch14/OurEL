package dataConsole.myk;

import game.Game;


/*
 * ����ʱ�����ӵķ���
 * */
public class Distance implements Runnable {
	public static int distance;
	
	//���췽����ʵ��ÿ�ε�����Ϸ�����ʼ�����
	public Distance(){
		distance=0;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(Game.result.equals("ing")){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			distance+=13;
			//System.out.println("�������"+distance);
		}
	}
	
}
