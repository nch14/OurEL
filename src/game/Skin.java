package game;

import interFace.Main_interface;

import java.awt.Graphics;

import opAnimate.Util;

/*
 * ����ʵ���˻�������
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
	
/*	//�÷�������ʵ�ֱ���ѭ����������
	public String paintComponent(){
		String str="back/�λô�������ϵ���ƶ�̬��Ƶ�ز�_00";
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
		// TODO �Զ����ɵķ������
		try {
			Thread.sleep(100/3);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		skin[0]=paintComponent();
	}
		*/
}
	
