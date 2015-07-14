package interFace;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.*;
public class Ranking extends JFrame {
	JPanel content,jp=null,jp1;
	JLabel label,jl,jlnewpoint;
	JLabel[] jlpoints=new JLabel[10];
	JButton jb;
	ImageIcon background;
	
	public static void main(String[] args){
		Ranking rank=new Ranking(13);
	}
	
	
	
	public Ranking(int s)
	{		
		background=new ImageIcon("graphics/排行榜final.png");
		label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		content=(JPanel) this.getContentPane();
		content.setOpaque(false);
		
		
		//south
		jb=new JButton("");
		jb.setIcon(new ImageIcon("graphics/排行榜关闭按钮final.png"));
		jb.setBorderPainted(false);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
		jb.setBounds(920, 30, 14, 14);

		jp1=new JPanel();
		jp1.setOpaque(false);
		jp1.setLayout(null);
		jp1.add(jb);
		

		//待定
		jlnewpoint=new JLabel(""+s);
		jlnewpoint.setFont(new Font("宋体",Font.BOLD,36));
		jlnewpoint.setBounds(270, 90, 400, 40);
		jp1.add(jlnewpoint);

		
		
		
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader("data"); 
			br=new BufferedReader(fr);
			String line=null;
			int j=0;
			while((line=br.readLine())!=null&&j<10)
			{
				jlpoints[j]=new JLabel(line);
				jlpoints[j].setFont(new Font("宋体",Font.BOLD, 34));
				j++;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int x1=170,x2=680,y=160;
				
		//添加组件
		for(int k=0;k<8;k++)
		{
			if(k%2==0)
			{
				jlpoints[k].setBounds(x1, y, 400, 40);
				jp1.add(jlpoints[k]);
			}else
			{
				jlpoints[k].setBounds(x2, y, 400, 40);
				jp1.add(jlpoints[k]);
				y+=58;
			}
				
		}
		
		
		this.add(jp1);
		
		
		this.setSize(background.getIconWidth(),  background.getIconHeight());
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
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

