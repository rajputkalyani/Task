package pqr;

public class variable2 {
	
	//1st Static
	static int d=60;
	static int e=50;
	static int g=d+e;
	
	//2nd Static
	static int p=70;
	static int q=30;
	static int r=p*q;
	
	//3rd Static
	static int x=50;
	static int y=20;
	static int z=x%y;
	

	public static void main(String[] args) {
		
		variable2 s = new variable2();
		System.out.println(s.g);
		System.out.println(s.r);
		System.out.println(s.z);

	}

}
