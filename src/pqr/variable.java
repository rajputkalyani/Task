package pqr;

public class variable {
	// 1st nonstatic
	int a=20;
	int b=30;
	int c=a+b;
	
	// 2nd nonstatic
	int d=70;
	int e=50;
	int f=d-e;
	
	// 3rd nonstatic
	int x=90;
	int y=20;
	int z=x/y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		variable d=new variable();
		System.out.println(d.c);
		System.out.println(d.f);
		System.out.println(d.z);

	}

}
