package dataConsole.myk;

public class Coordinate {
	public static int x;
	public static int y;
	
	//���췽����ʵ��ÿ�ε�����Ϸ�����ʼ������
	public Coordinate(){
		x=360;
		y=570;
	}
	
	
	public void xLChange(){
		if(x>27){
			x=x-3-(int)((0.01*Civ.civ)+0.5)-5;
		}
	}
	public void xRChange(){
		if(x<730){
			x=x+3+(int)((0.01*Civ.civ)+0.5)+5;
		}
	}
	public void yUChange(){
		if(y>28){
			y=y-3-(int)((0.01*Civ.civ)+0.5)-5;
		}
	}
	public void yDChange(){
		if(y<580){
			y=y+3+(int)((0.01*Civ.civ)+0.5)+5;
		}
	}
	
	
	
	
	
	}

