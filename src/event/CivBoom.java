package event;

import java.util.Random;

public class CivBoom extends Event {

	@Override
	public boolean getResult() {
		final int random = new Random().nextInt(2);//随机数设为0和1,50%文明爆炸
		if(random==1)    //random 是1的时候为文明boom
		return true;
		else return false;
	}

	@Override
	public String getData() {
		// TODO 自动生成的方法存根
		return null;
	}
}
