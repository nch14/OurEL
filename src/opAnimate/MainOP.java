package opAnimate;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
/*����MainOP.start()�ͻ��½����ڲ��ţ��������˾ͻ�رմ���,Ҳ����ֱ�ӵ���close�ر�
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
		f.setLocation(0,0);//���������Ļ���λ��
		f.setVisible(true);
		f.setTitle("�Ǽ�̽��");
		//f.setIconImage(new ImageIcon("graphics/myShip2.png").getImage());
		addKeyListener(f);
		Draw  d=new Draw(f);
		f.getContentPane().add(BorderLayout.CENTER,d);
		new PaintThread().start();   //Launch Repaint
		

	}

	/*
	 * ����һ���ػ����ڵ��߳��࣬��һ���ڲ���
	 * */
	class PaintThread extends Thread{
		public void run (){

			while (true) {
				
				f.repaint();
				try {
					Thread.sleep(100/3);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}	
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		System.out.println("wo bei ji huo");
		if(arg0.getKeyCode()==KeyEvent.VK_UP){
			System.out.println("wo bei ji huo");
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		start();
	}
	

}
