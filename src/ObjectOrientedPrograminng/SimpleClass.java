package ObjectOrientedPrograminng;

public class SimpleClass extends SimpleAbs implements SimpleInter{

	@Override
	void a4() {
		System.out.println("a4 from abstact class - overrided");
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	public static void  main(String[]args) {
		a1();
		SimpleClass ok = new SimpleClass ();
		ok.a2();
		ok.a3();
		ok.a4();
		System.out.println(a);
		System.out.println(ok.b);
		SimpleInter.a5();
		ok.a6();
		ok.a7();
		ok.a9();
		System.out.println(z);
		 
		
		
		
		
	}





	@Override
	public void a6() {
		System.out.println("a6 from InterFace");
		// TODO Auto-generated method stub
		
	}





	@Override
	public void a7() {
		System.out.println("a7 from InterFace");
		// TODO Auto-generated method stub
		
	}





	@Override
	public void a8() {
		System.out.println("a8 from InterFace");
		// TODO Auto-generated method stub
		
	}





	@Override
	public void a9() {
		System.out.println("a9 from InterFace");
		// TODO Auto-generated method stub
		
	}

}
