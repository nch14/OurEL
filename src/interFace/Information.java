package interFace;
import interFace.Ranking.ExitListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Information extends JFrame{
	
	ImageIcon background;
	JLabel label;
	JPanel content;
	JButton jb;
	JPanel jp1;
	public Information()
	{
		background=new ImageIcon("graphics/关于界面final.png");
		label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		content=(JPanel) this.getContentPane();
		content.setOpaque(false);
		
		
		jb=new JButton("");
		jb.setIcon(new ImageIcon("graphics/排行榜关闭按钮final.png"));
		jb.setBorderPainted(false);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
		jb.setBounds(910, 25, 14, 14);

		jp1=new JPanel();
		jp1.setOpaque(false);
		jp1.setLayout(null);
		jp1.add(jb);
		
		this.add(jp1);
		this.setSize(background.getIconWidth(), background.getIconHeight());
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb.addActionListener(new ExitListener());
	
	
	
	
	
	}
	class ExitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			dispose();
		}
		
	}
}
