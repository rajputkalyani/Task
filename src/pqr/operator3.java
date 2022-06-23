package pqr;

public class operator3 {
	
	// Logical Operator
	
	public void qq()
	{
		int x=50;
		int y=45;
		
		System.out.println((x>y) && (x<y));
		System.out.println((x>y) || (x<y));
        System.out.println((x==y) && (x!=y));
        System.out.println((x==y) || (x!=y));
	}

	public static void main(String[] args) {
		operator3 v = new operator3();
		v.qq();
		

	}

}
