package ui;

import game.Plane;
import game.Skin;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGame extends JPanel{
	private Frame[] frames =null; 
	//static ArrayList arrayUI=new ArrayList();
	private static final long serialVersionUID = -4916424649169424601L;
	
	public PanelGame(Plane plane){
			frames = new Frame[]{
			new FrameMainGame(15,15,800,650,plane),
			new FrameCivil(850,15,225,100),
			new FrameFuel(850,135,225,100),
			//new FrameShield(850,255,225,100),
			new FrameScore(850,375,225,120)
		};
		
	}
	public void paintComponent(Graphics g){
		Image back = new ImageIcon(Skin.skin[0]).getImage();
		g.drawImage(back, 0, 0,1280,720,0,0 ,1280,720,null);
		for(int i=0;i<frames.length;i++){
			frames[i].paint(g);
		}
	}
}
