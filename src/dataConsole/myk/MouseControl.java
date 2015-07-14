package dataConsole.myk;

public class MouseControl  implements Runnable{
	int xM=0;
	int yM=0;
	double spx;//水平加速度
	double spy;//竖直加速度
	byte pointx=0;
	byte pointy=0;
	int xindex=1;
	int yindex=1;
	
	public MouseControl(int x ,int y){
		xM=x;
		yM=y;
		//设定在点选时力的大小为自身重力的2倍
		//计算分加速度
		spx=2*(Math.sqrt((xM-Coordinate.x)^2))/Math.hypot((xM-Coordinate.x), (Coordinate.y-yM));
		spy=2*(Math.sqrt((Coordinate.y-yM)^2))/Math.hypot((xM-Coordinate.x), (Coordinate.y-yM))-1;
		//计算方向
		if(xM>Coordinate.x){
			pointx=1;
		}else{
			pointx=-1;
		}
		if(yM>Coordinate.y){
			pointy=1;
		}else{
			pointy=-1;
		}
	}

	
	
	
	
	
	public void mouseControl(int xM,int yM){		
		//水平
		/*Coordinate.x=(int)(20*(xindex/25)*spx*pointx+Coordinate.x)+1;
		xindex+=2;*/
		Coordinate.x=Coordinate.x+xindex*pointx;
		xindex++;;
		
		//竖直
/*		Coordinate.y=(int)(Coordinate.y+pointy*2*(yindex/15)*spy)+1;
		yindex++;*/
		Coordinate.y=Coordinate.y+yindex*pointy;
		yindex+=2;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
			e.printStackTrace();
			}
			mouseControl(xM,yM);
		}
	}
		

}
