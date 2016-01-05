package test.test.test;

public class AutoAssign {

	private int id;
	
	public AutoAssign(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public AutoAssign refresh(){
		AutoAssign autoAssign = new AutoAssign(this.id+1);
		
		return autoAssign;
	}
	
}
