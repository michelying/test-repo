package test.test.test;

public class TestAutoAssign {

	public static void main(String[] args) {
		

		AutoAssign autoAssign = new AutoAssign(1);
		
		System.out.println(autoAssign.getId());
		
		autoAssign = autoAssign.refresh();
		
		System.out.println(autoAssign.getId());
		
	}

}
