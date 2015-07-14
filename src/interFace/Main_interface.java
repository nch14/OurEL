package interFace;
import game.Game;

import javax.swing.*;

import musicplayer.MusicPlayer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main_interface extends JFrame {

		JPanel jp;
		JPanel content;
		//�ĸ���ť
		JButton jb1,jb2,jb3,jb4;
		//����
		ImageIcon background;
		JLabel label;
		public static Thread amusic;

		
		public Main_interface()
		{
			//�������ñ���ͼƬ
			background=new ImageIcon("graphics/��ʼ��Ϸ����.jpg");
			label=new JLabel(background);
			label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
			this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
			content=(JPanel) this.getContentPane();
			content.setOpaque(false);
					
			jb1=new JButton("");
			jb1.setBounds(1084, 420, 196, 50);
			jb1.setIcon(new ImageIcon("graphics/��ʼ��Ϸ.png"));
			jb1.setContentAreaFilled(false);
			
			jb2=new JButton("");
			jb2.setBounds(1104, 490, 176, 50);
			jb2.setIcon(new ImageIcon("graphics/���а�.png"));	
			jb2.setContentAreaFilled(false);
			
			jb3=new JButton("");
			jb3.setBounds(1137, 560, 143, 50);
			jb3.setIcon(new ImageIcon("graphics/about.png"));	
			jb3.setContentAreaFilled(false);
			
			jb4=new JButton("�˳�");
			jb4.setBounds(1150, 630, 134, 50);
			jb4.setIcon(new ImageIcon("graphics/�˳�.png"));	
			jb4.setContentAreaFilled(false);

			jp=new JPanel();
			jp.setOpaque(false);
			jp.setLayout(null);

			jp.add(jb1);
			jp.add(jb2);
			jp.add(jb3);
			jp.add(jb4);
			

	
			this.add(jp);
		
			this.setSize(1295,720);;
			this.setTitle("�Ǽ�̽��");
			this.setLocation(0,0);
			this.setVisible(true);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MusicPlayer mp=new MusicPlayer("sound/back.mp3");
			Thread music =new Thread(mp);
			music.start();
			amusic=music;
			
			jb1.addActionListener(new StartListener());
			jb2.addActionListener(new RankListener());
			jb3.addActionListener(new AboutListener());
			jb4.addActionListener(new ExitListener());
		}
		
		//�ĸ���ť����
		class StartListener implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				dispose();
				Main_interface.amusic.stop();
				Game myGame=new Game();
				myGame.go();
			}
			
		}
		
		class RankListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				Ranking newrank=new Ranking(54120);
			}
			
		}
		
		class AboutListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				Information a=new Information();
			}
			
		}
		
		class ExitListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(ABORT);
			}
			
		}
		
}
