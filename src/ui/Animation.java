package ui;

public class Animation implements Runnable{
	public Animation(){
		
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		StartAnimation sa = new StartAnimation();
		sa.setVisible(true);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		sa.setVisible(false);
		//new FrameGame().setVisible(true);
		
	}
	
}
