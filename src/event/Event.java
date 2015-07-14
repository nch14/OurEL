package event;



public abstract class Event {
	boolean happen;
	public  abstract boolean getResult();
	public abstract String getData();  //获取某些方法的特殊数据
		
	
	
}
