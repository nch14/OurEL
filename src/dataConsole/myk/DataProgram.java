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
//	//获取路程，调用Distance
//	public int getDistance(){
//		endTime=new Date();
//		int x=Distance.calculate(startTime, endTime);
//		return x;
//	}
//	//获取文明值
//	public  int getCiv(){ 
//		civ=Civ.nature();
//		if(event[2]){                //发生文明爆炸
//			Civ.civBoom();
//		}
//		return civ;
//	}
//	//返回生成一个文明的信息数组。[0]是类型，[1]是文明值
//	public int[] getOtherCivInfo(){    
//		OtherCivInfo a=new OtherCivInfo(Civ.civ);
//		otherinfo= a.getOtherCivInfo();
//		return otherinfo;
//	}
//	//获取燃料
//	public int getEnergy(){
//		if(event[0]){
//			
//		}
//		energy=Energy.energy;
//		return energy;
//	}
//	//获取护甲
//	public int getArmor(){
//		armor= Armor.Armor;
//		return armor;
//	}
//	//设置HitStone的参数，传入坐标
//	public void setHitStone(Things myplane,ArrayList<Things> stone){
//		this.myplane=myplane;
//		this.stone=stone;
//	}
//	/*获取事件信息，撞石头0，遇见其他文明1，文明爆炸2
//	 * 调用前先调用setHitStone
//	*/
//	public boolean[] getEvent(){		
//		//实例化所有result
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
//			reason=result2[0].getData();     //将原因放进了reason
//			}//GameOver的处理
//		return event2;
//	}
//	//返回GameOver的原因
//	public String getReasonOfGameOver(){
//		return reason;
//	}
}
