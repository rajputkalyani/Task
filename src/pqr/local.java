package pqr;

public class local {
	
	//1st local
	public void method()
	{
		int a=30;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
    
	//2nd local
	public void method2()
	{
		int k=70;
		int l=20;
		int m=k/l;
		System.out.println(m);
	}
	
	//3rd local
	public void method3()
	{
		int g=50;
		int h=30;
		//int i=g*h;
		System.out.println(h);
	}
	
	public static void main(String[] args) {
		
		local v=new local();
		v.method();
		v.method2();
		v.method3();
		

	}

}
