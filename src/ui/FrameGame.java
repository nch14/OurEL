	package ui;

	import game.*;
import interFace.Information;
import interFace.Main_interface;
import interFace.Ranking;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import dataConsole.myk.Bullet;
import dataConsole.myk.MouseControl;
import dataConsole.myk.OtherCiv;
import event.War;



		public class FrameGame extends JFrame implements Runnable,KeyListener,MouseListener{
		Plane aPlane;
		PanelGame aPanelGame;
		JButton silent,back,changebackground;
		private static final long serialVersionUID = -6194695820531427582L;

		public FrameGame(Plane me){
			this.aPlane=me;
			this.setTitle("�Ǽ�̽��");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(1280,720);
			this.setResizable(false);
			this.setLocation(0, 0);
			
			aPanelGame=new PanelGame(aPlane);
			this.setContentPane(aPanelGame);
			this.addKeyListener(this);
			this.addMouseListener(this);
			this.setLayout(null);
			
			//������ť
			silent= new JButton("");
			silent.setBounds(1130, 630, 40, 40);
			silent.setIcon(new ImageIcon("graphics/����.png"));
			silent.setFocusPainted(false);
			silent.setBorderPainted(false);
			silent.setContentAreaFilled(false);
			
			//���ذ�ť
			back=new JButton("");
			back.setBounds(1180, 630, 40, 40);
			back.setIcon(new ImageIcon("graphics/���ذ�ť.png"));
			back.setFocusPainted(false);
			back.setBorderPainted(false);
			back.setContentAreaFilled(false);
			
			//������ť
			changebackground=new JButton("������ť");
			changebackground.setFont(new Font("����",Font.BOLD,18));
			changebackground.setBounds(1010, 630, 120, 40);
			changebackground.setFocusPainted(false);
//			changebackground.setBorderPainted(false);
			changebackground.setContentAreaFilled(false);
			
			this.add(silent);
			this.add(back);
			this.add(changebackground);
			
			silent.addActionListener(new silentListener());
			back.addActionListener(new backListener());
			changebackground.addActionListener(new skinListener());
			

		}

		@Override
		public void run() {
			// TODO �Զ����ɵķ������
			//this.addKeyListener(this);
			while(true){
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				aPanelGame.repaint();
				Game.aFG.setFocusable(true);
			}
		}

		//�����¼�����
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO �Զ����ɵķ������
			FrameGame.this.requestFocus();
			//���Ʒɴ��ƶ�
			if(e.getKeyCode()==KeyEvent.VK_RIGHT||e.getKeyCode()==KeyEvent.VK_D){
				aPlane.myCoordinate.xRChange();
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT||e.getKeyCode()==KeyEvent.VK_A){
				aPlane.myCoordinate.xLChange();
			}
			if(e.getKeyCode()==KeyEvent.VK_UP||e.getKeyCode()==KeyEvent.VK_W){
				aPlane.myCoordinate.yUChange();
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN||e.getKeyCode()==KeyEvent.VK_S){
				aPlane.myCoordinate.yDChange();
			}
			
			//�������ѡ��ѡ�����ֲ�ͬ���ӵ�
			if(e.getKeyCode()==KeyEvent.VK_V){
				BulletControl aBulletControl=new BulletControl(1);
				aBulletControl.BulletConsole();
				aBulletControl=null;
				
			}
			if(e.getKeyCode()==KeyEvent.VK_B){
				BulletControl aBulletControl=new BulletControl(2);
				aBulletControl.BulletConsole();
				aBulletControl=null;
				
			}
			if(e.getKeyCode()==KeyEvent.VK_N){
				BulletControl aBulletControl=new BulletControl(3);
				aBulletControl.BulletConsole();
				aBulletControl=null;
			}
			
			//�������ѡ���Ƿ��������𹥻�
			if(e.getKeyCode()==KeyEvent.VK_ENTER&&OtherCiv.otherCivExists==1){
				OtherCiv.playerChoose=2;
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO �Զ����ɵķ������
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO �Զ����ɵķ������

		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO �Զ����ɵķ������
			MouseControl mc=new MouseControl(arg0.getX(),arg0.getY());
			Thread mct=new Thread(mc);
			mct.start();
		}

		
		
		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO �Զ����ɵķ������
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO �Զ����ɵķ������
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO �Զ����ɵķ������

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO �Զ����ɵķ������
			
		}

		class silentListener implements ActionListener{
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				FrameGame.this.requestFocus();
				Game.aM.stop();
			}
			
		}
		
		class backListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				FrameGame.this.requestFocus();
				Main_interface a=new Main_interface();
				Game.aFG.dispose();
				
			}
			
		}
		
		class skinListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				FrameGame.this.requestFocus();
				Skin.changeSkin();
				Game.aFG.setFocusable(true);
			}
			
		}
		


	}

