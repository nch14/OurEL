package ui;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import dataConsole.myk.Distance;
import dataConsole.myk.Energy;

public class FrameFuel extends Frame{
	private Image fuel = new ImageIcon("graphics/fuel2.png").getImage();
	public FrameFuel(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO 自动生成的构造函数存根
	}
	public void paint(Graphics g){
		/*this.createFrame(g);*/
		String s;
		if(Energy.energy>=0){
			s=""+Energy.energy;
		}else{
			s=""+0;
		}
		g.setFont(new Font("宋体",Font.BOLD, 32));
		g.setColor(Color.white);
		g.drawString(s, this.x+150, this.y+80);
		g.drawImage(fuel, this.x+10,this.y+10,null);
		
	}
}
