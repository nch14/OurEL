package opAnimate;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
/*调用MainOP.start()就会新建窗口播放，播放完了就会关闭窗口,也可以直接调用close关闭
 * */
public class MainOP extends JFrame implements KeyListener,Runnable {
	MainOP f;
	
	public MainOP(){
		addKeyListener(f);
	}
	public static void start(){
		MainOP m=new MainOP();
		m.creat();
	}
	void creat(){
		f=new MainOP();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1280, 720);
		this.setResizable(false);
		f.setLocation(0,0);//界面相对屏幕起点位置
		f.setVisible(true);
		f.setTitle("星际探险");
		//f.setIconImage(new ImageIcon("graphics/myShip2.png").getImage());
		addKeyListener(f);
		Draw  d=new Draw(f);
		f.getContentPane().add(BorderLayout.CENTER,d);
		new PaintThread().start();   //Launch Repaint
		

	}

	/*
	 * 定义一个重画窗口的线程类，是一个内部类
	 * */
	class PaintThread extends Thread{
		public void run (){

			while (true) {
				
				f.repaint();
				try {
					Thread.sleep(100/3);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}	
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		System.out.println("wo bei ji huo");
		if(arg0.getKeyCode()==KeyEvent.VK_UP){
			System.out.println("wo bei ji huo");
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		start();
	}
	

}
