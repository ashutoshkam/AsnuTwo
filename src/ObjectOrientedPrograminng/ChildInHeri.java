package ObjectOrientedPrograminng;

public class ChildInHeri extends ParentInheri  {
	public static int a = 10 ;
	public int b = 20 ;
	
	
	public static void c1(){
		System.out.println(a);
		ChildInHeri ok =new ChildInHeri();
	System.out.println(ok.b);
		System.out.println(ParentInheri.a);
		ParentInheri pl =new ChildInHeri();
        System.out.println(pl.b);

		System.out.println("c1 is static from child ");
	}
	
	public  void c2(){
		int b= 5000;
		
		System.out.println(a);
		System.out.println(this.b);
		System.out.println(ParentInheri.a);
        System.out.println(super.b);
		System.out.println("c2 is NON static from child ");
		System.out.println(b);
	}
	
	
	
	
	public static void main (String[]args) {
		p1();
		ChildInHeri obj =	new ChildInHeri ();
		obj.p2();
		c1();
		obj.c2();
	
		
	}
	
	
}
