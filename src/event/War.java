package event;

import dataConsole.myk.Energy;

/*
 * ʤ������true��ʧ�ܾ���false
 * �Զ�ս���㷨������ʤ�����ʵ���50%,���/��������ֵ�ó�һ����ֵ����ֵ�ж��Ƿ񳬹�1��Ȼ���ֵ/2�����ʤ�����ʼ��㡣
 * */

public class War extends Event {
	private double quotients=0;    //��ֵ
	double othercivValue;
	double meCivDouble=0;
	double meChoose=1;
	double probility;
	boolean result;
	public War(int x,int y,double z,int n){
		
		othercivValue=y;
		
		//�����������������ҷ���ս��
		if(n==2&&z==1){
			
		}
		
		//����Ѻ�����������ҷ���ս��
		if(n==1&&z==1){
			Energy.energy=(int) (Energy.energy+0.05*othercivValue);
		}
		
		//��Եж�����������ҷ���ս��
		if(n==3&&z==1){
			othercivValue=othercivValue*1.1;
			quotients=meCivDouble/othercivValue;
			war();	
		}
		
		//���ѡ��ս��
		if((n==2&&z==2)||(n==1&&z==2)||(n==3&&z==2)){		
			meCivDouble=meCivDouble*1.1;
			quotients=meCivDouble/othercivValue;
			war();
		}
		

		
	}
	
	
	
	
	
	
	
	
	public void war(){
		//������Ч��������
		//System.out.println("ս��ǰ"+Energy.energy);
		if(quotients>1){
			Energy.energy=(int) (0.1*othercivValue+Energy.energy);
		}else{
			Energy.energy=(int) (-0.1*othercivValue+Energy.energy);
		}
		
		//System.out.println("ս����"+Energy.energy);
		//
	}
	
	
	
	
	@Override
	public boolean getResult(){
		
	
		return result;
	}
/*	private boolean caculate(){   //��������������������
		//����һ��0��1�������
		double temp=Math.random();
		if(temp<=probility){
			return true;
		}else if (temp>probility){
			return false;
		}else {                                //�������
			System.out.println("caculate��������");
			return false;
		}*/
	
	@Override
	public String getData() {
		// TODO �Զ����ɵķ������
		return null;
	}	
}
