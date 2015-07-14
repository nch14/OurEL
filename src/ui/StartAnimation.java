package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class StartAnimation extends JFrame{
	
	private static final long serialVersionUID = 3519435575535323510L;

	public StartAnimation(){
		this.setTitle("ИэМе");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setResizable(false);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen=toolkit.getScreenSize();
		int x =( screen.width-this.getWidth())/2;
		int y =( screen.height-this.getHeight())/2-32;
		this.setLocation(x, y);
		
	}
}
