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
		//四个按钮
		JButton jb1,jb2,jb3,jb4;
		//背景
		ImageIcon background;
		JLabel label;
		public static Thread amusic;

		
		public Main_interface()
		{
			//首先设置背景图片
			background=new ImageIcon("graphics/开始游戏界面.jpg");
			label=new JLabel(background);
			label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
			this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
			content=(JPanel) this.getContentPane();
			content.setOpaque(false);
					
			jb1=new JButton("");
			jb1.setBounds(1084, 420, 196, 50);
			jb1.setIcon(new ImageIcon("graphics/开始游戏.png"));
			jb1.setContentAreaFilled(false);
			
			jb2=new JButton("");
			jb2.setBounds(1104, 490, 176, 50);
			jb2.setIcon(new ImageIcon("graphics/排行榜.png"));	
			jb2.setContentAreaFilled(false);
			
			jb3=new JButton("");
			jb3.setBounds(1137, 560, 143, 50);
			jb3.setIcon(new ImageIcon("graphics/about.png"));	
			jb3.setContentAreaFilled(false);
			
			jb4=new JButton("退出");
			jb4.setBounds(1150, 630, 134, 50);
			jb4.setIcon(new ImageIcon("graphics/退出.png"));	
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
			this.setTitle("星际探险");
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
		
		//四个按钮监听
		class StartListener implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				dispose();
				Main_interface.amusic.stop();
				Game myGame=new Game();
				myGame.go();
			}
			
		}
		
		class RankListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				Ranking newrank=new Ranking(54120);
			}
			
		}
		
		class AboutListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				Information a=new Information();
			}
			
		}
		
		class ExitListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.exit(ABORT);
			}
			
		}
		
}
