package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Frame {
	private static final int SIZE = 7;
	private static Image WINDOW_IMG = new ImageIcon("graphics/Window.png").getImage();
	private static final int WINDOW_H = WINDOW_IMG.getHeight(null);
	private static final int WINDOW_W = WINDOW_IMG.getWidth(null);
     protected int x;//左上角左边
     protected int y;
     private int w;//窗口宽度
     private int h;//窗口高度
     public Frame(int x,int y,int w,int h){
    	 this.x = x;
    	 this.y = y;
    	 this.w = w;
    	 this.h = h;
     }
     public void createFrame(Graphics g){
    	 g.drawImage(WINDOW_IMG, x, y,x+SIZE,y+SIZE,0 ,0, SIZE,SIZE,null);//左上
    	 g.drawImage(WINDOW_IMG, x+SIZE, y,x+w-SIZE,y+SIZE,SIZE ,0, WINDOW_W-SIZE,SIZE,null);//中上
    	 g.drawImage(WINDOW_IMG, x+w-SIZE, y,x+w,y+SIZE,WINDOW_W-SIZE ,0, WINDOW_W,SIZE,null);//右上
    	 g.drawImage(WINDOW_IMG, x, y+SIZE,x+SIZE,y+h-SIZE,0 ,SIZE,SIZE,WINDOW_H-SIZE,null);//左
    	 g.drawImage(WINDOW_IMG, x+SIZE, y+SIZE,x+w-SIZE,y+h-SIZE,SIZE ,SIZE, WINDOW_W-SIZE,WINDOW_H-SIZE,null);//中
    	 g.drawImage(WINDOW_IMG, x+w-SIZE, y+SIZE,x+w,y+h-SIZE,WINDOW_W-SIZE,SIZE, WINDOW_W,WINDOW_H-SIZE,null);//右
    	 g.drawImage(WINDOW_IMG, x, y+h-SIZE,x+SIZE,y+h,0 ,WINDOW_H-SIZE, SIZE,WINDOW_H,null);//左下
    	 g.drawImage(WINDOW_IMG, x+SIZE, y+h-SIZE,x+w-SIZE,y+h,SIZE ,WINDOW_H-SIZE, WINDOW_W-SIZE,WINDOW_H,null);//中下
    	 g.drawImage(WINDOW_IMG, x+w-SIZE, y+h-SIZE,x+w,y+h,WINDOW_W-SIZE ,WINDOW_H-SIZE, WINDOW_W,WINDOW_H,null);//右下
    }
	public void paint(Graphics g) {
		// TODO 自动生成的方法存根
		
	}
}
