package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import dataConsole.myk.Civ;
import dataConsole.myk.Distance;

public class FrameCivil extends Frame{
	private Image civil = new ImageIcon("graphics/civil2.png").getImage();
	public FrameCivil(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void paint(Graphics g){
	/*	this.createFrame(g);*/
		String s=""+Civ.civ;
		g.setFont(new Font("����",Font.BOLD, 32));
		g.setColor(Color.white);
		g.drawString(s,this.x+150,this.y+80);
		g.drawImage(civil, this.x+10,this.y+10,null);
	}

}
