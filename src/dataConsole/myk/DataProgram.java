package dataConsole.myk;

import java.util.ArrayList;
import java.util.Date;

import event.*;


public class DataProgram {
//	Date startTime;
//	Date endTime;
//	int civ=10;
//	int energy,armor;
//	String reason="default";
//	
//	boolean[] event={false,false,false,false};
//	boolean[] event2={false,false,false,false};
//	
//	int[] otherinfo=new int[5];
//	Things myplane=null;
//	ArrayList<Things>stone=null;
//	
//	public DataProgram(){
//		startTime=new Date();		
//	}
//	
//	//��ȡ·�̣�����Distance
//	public int getDistance(){
//		endTime=new Date();
//		int x=Distance.calculate(startTime, endTime);
//		return x;
//	}
//	//��ȡ����ֵ
//	public  int getCiv(){ 
//		civ=Civ.nature();
//		if(event[2]){                //����������ը
//			Civ.civBoom();
//		}
//		return civ;
//	}
//	//��������һ����������Ϣ���顣[0]�����ͣ�[1]������ֵ
//	public int[] getOtherCivInfo(){    
//		OtherCivInfo a=new OtherCivInfo(Civ.civ);
//		otherinfo= a.getOtherCivInfo();
//		return otherinfo;
//	}
//	//��ȡȼ��
//	public int getEnergy(){
//		if(event[0]){
//			
//		}
//		energy=Energy.energy;
//		return energy;
//	}
//	//��ȡ����
//	public int getArmor(){
//		armor= Armor.Armor;
//		return armor;
//	}
//	//����HitStone�Ĳ�������������
//	public void setHitStone(Things myplane,ArrayList<Things> stone){
//		this.myplane=myplane;
//		this.stone=stone;
//	}
//	/*��ȡ�¼���Ϣ��ײʯͷ0��������������1��������ը2
//	 * ����ǰ�ȵ���setHitStone
//	*/
//	public boolean[] getEvent(){		
//		//ʵ��������result
//		Event[] result={new HitStone(myplane,stone),new OtherCiv(),new CivBoom()};
//		for(int i=0;i<3;i++){
//			event[i]=result[i].getResult();
//		}
//		return event;
//	}
//	public boolean[] getEvent2(){
//		Event[] result2={new GameOver(energy,armor),new War(civ,otherinfo[1])};
//		for(int i=0;i<2;i++){
//			event2[i]=result2[i].getResult();
//		}
//		if(!event2[0]){
//			reason=result2[0].getData();     //��ԭ��Ž���reason
//			}//GameOver�Ĵ���
//		return event2;
//	}
//	//����GameOver��ԭ��
//	public String getReasonOfGameOver(){
//		return reason;
//	}
}
