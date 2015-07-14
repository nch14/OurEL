package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import dataConsole.myk.Distance;

public class FrameScore extends Frame {
	private Image currentScore = new ImageIcon("graphics/currentScore2.png").getImage();
	public FrameScore(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void paint(Graphics g){
		/*this.createFrame(g);*/
		String s=""+Distance.distance;
		g.setFont(new Font("����",Font.BOLD, 32));
		g.setColor(Color.black);
		g.drawString("Your Score:", this.x,this.y+40);
		g.setFont(new Font("����",Font.BOLD, 68));
		g.drawString(s,this.x+40,this.y+120);
	}
}
