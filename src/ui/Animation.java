package ui;

public class Animation implements Runnable{
	public Animation(){
		
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		StartAnimation sa = new StartAnimation();
		sa.setVisible(true);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		sa.setVisible(false);
		//new FrameGame().setVisible(true);
		
	}
	
}
