package dataConsole.myk;

public class MouseControl  implements Runnable{
	int xM=0;
	int yM=0;
	double spx;//ˮƽ���ٶ�
	double spy;//��ֱ���ٶ�
	byte pointx=0;
	byte pointy=0;
	int xindex=1;
	int yindex=1;
	
	public MouseControl(int x ,int y){
		xM=x;
		yM=y;
		//�趨�ڵ�ѡʱ���Ĵ�СΪ����������2��
		//����ּ��ٶ�
		spx=2*(Math.sqrt((xM-Coordinate.x)^2))/Math.hypot((xM-Coordinate.x), (Coordinate.y-yM));
		spy=2*(Math.sqrt((Coordinate.y-yM)^2))/Math.hypot((xM-Coordinate.x), (Coordinate.y-yM))-1;
		//���㷽��
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
		//ˮƽ
		/*Coordinate.x=(int)(20*(xindex/25)*spx*pointx+Coordinate.x)+1;
		xindex+=2;*/
		Coordinate.x=Coordinate.x+xindex*pointx;
		xindex++;;
		
		//��ֱ
/*		Coordinate.y=(int)(Coordinate.y+pointy*2*(yindex/15)*spy)+1;
		yindex++;*/
		Coordinate.y=Coordinate.y+yindex*pointy;
		yindex+=2;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			}
			mouseControl(xM,yM);
		}
	}
		

}
