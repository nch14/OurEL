package event;

import java.util.Random;

public class CivBoom extends Event {

	@Override
	public boolean getResult() {
		final int random = new Random().nextInt(2);//�������Ϊ0��1,50%������ը
		if(random==1)    //random ��1��ʱ��Ϊ����boom
		return true;
		else return false;
	}

	@Override
	public String getData() {
		// TODO �Զ����ɵķ������
		return null;
	}
}
