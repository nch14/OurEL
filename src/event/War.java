package event;

import dataConsole.myk.Energy;

/*
 * 胜利就是true，失败就是false
 * 自动战斗算法：基础胜利几率等于50%,玩家/敌人文明值得出一个比值，比值判断是否超过1，然后比值/2与基础胜利几率计算。
 * */

public class War extends Event {
	private double quotients=0;    //比值
	double othercivValue;
	double meCivDouble=0;
	double meChoose=1;
	double probility;
	boolean result;
	public War(int x,int y,double z,int n){
		
		othercivValue=y;
		
		//面对中立文明，且玩家放弃战斗
		if(n==2&&z==1){
			
		}
		
		//面对友好文明，且玩家放弃战斗
		if(n==1&&z==1){
			Energy.energy=(int) (Energy.energy+0.05*othercivValue);
		}
		
		//面对敌对文明，且玩家放弃战斗
		if(n==3&&z==1){
			othercivValue=othercivValue*1.1;
			quotients=meCivDouble/othercivValue;
			war();	
		}
		
		//玩家选择战斗
		if((n==2&&z==2)||(n==1&&z==2)||(n==3&&z==2)){		
			meCivDouble=meCivDouble*1.1;
			quotients=meCivDouble/othercivValue;
			war();
		}
		

		
	}
	
	
	
	
	
	
	
	
	public void war(){
		//被击败效果（界面
		//System.out.println("战斗前"+Energy.energy);
		if(quotients>1){
			Energy.energy=(int) (0.1*othercivValue+Energy.energy);
		}else{
			Energy.energy=(int) (-0.1*othercivValue+Energy.energy);
		}
		
		//System.out.println("战斗后"+Energy.energy);
		//
	}
	
	
	
	
	@Override
	public boolean getResult(){
		
	
		return result;
	}
/*	private boolean caculate(){   //辅助方法，生成随机结果
		//生成一个0到1的随机数
		double temp=Math.random();
		if(temp<=probility){
			return true;
		}else if (temp>probility){
			return false;
		}else {                                //方法检查
			System.out.println("caculate方法错误！");
			return false;
		}*/
	
	@Override
	public String getData() {
		// TODO 自动生成的方法存根
		return null;
	}	
}
