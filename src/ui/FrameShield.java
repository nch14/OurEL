package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class FrameShield extends Frame{
	private Image sheild = new ImageIcon("graphics/sheild2.png").getImage();
	public FrameShield(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void paint(Graphics g){
		this.createFrame(g);
		g.drawImage(sheild, this.x+10,this.y+10,null);
	}
}
