package game;

import interFace.Main_interface;

import java.awt.Graphics;

import opAnimate.Util;

/*
 * 该类实现了换肤功能
 */
public class Skin /*implements Runnable*/ {
	public static String[] skin=new String[10];{
	skin[0]="skin1/back.jpg";
	skin[1]="skin1/plane.png";	
	skin[2]="graphics/bullet.png";
	skin[3]="skin1/gameover.png";
	skin[4]="skin1/backbutton.png";
	skin[5]="graphics/frame.gif";
	}
	
	
	public static int x=0;
	
	public static void changeSkin(){
		if(skin[1].charAt(4)=='1'){
			for(int i=0;i<5;i++){
				skin[i].replace('1','2');
			}
		}
		if(skin[1].charAt(4)=='2'){
			for(int i=0;i<5;i++){
				skin[i].replace('2','1');
			}
		}
		/*if(skin[1].charAt(4)=='3'){
			for(int i=0;i<10;i++){
				skin[i].replace('3','1');
			}
		}*/

	}
	
/*	//该方法用于实现背景循环动画播放
	public String paintComponent(){
		String str="back/梦幻大气银河系星云动态视频素材_00";
		x++;
		x=x%433;
		if(x>=10){
			if(x>=100){
				str+=String.valueOf(x)+"-inpainted.jpg";
			}else{
			str+="0"+String.valueOf(x)+"-inpainted.jpg";
			}
		}else{
			str+="00"+String.valueOf(x)+"-inpainted.jpg";
		}
		return str;
	}
	public void run() {
		// TODO 自动生成的方法存根
		try {
			Thread.sleep(100/3);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		skin[0]=paintComponent();
	}
		*/
}
	
