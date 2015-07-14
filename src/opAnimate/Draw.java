package opAnimate;

import interFace.Main_interface;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import musicplayer.MusicPlayer;


public class Draw extends JPanel{
	/**
	 * 
	 */
	MainOP f;

	Image img;
	static int x=0;
	public Draw(MainOP f) {
		this.f=f;
		// TODO 自动生成的构造函数存根
	}
	public void paintComponent(Graphics g){
		String str="images/op图片/Elop4.0_";
		x++;
		if(x>=10){
			if(x>=100){
				if(x>=1000){
					str+="0"+String.valueOf(x)+".jpg";
				}else
				str+="00"+String.valueOf(x)+".jpg";
			}else{
			str+="000"+String.valueOf(x)+".jpg";
			}
		}else{
			str+="0000"+String.valueOf(x)+".jpg";
		}
		if(x>2204){	
			Main_interface a=new Main_interface();
			f.dispose();
		}
		img=Util.getImage(str);
		g.drawImage(img, 0, 0, null);
	}
}
