package java_Classes;

public class Pyramid {
	
	
	public static void Sym_Pyramid () {
			for (int i=0; i<4; i++)
		
	{
		for (int j=1; j<=i+1; j++)
		{
			
			System.out.print(j + " ");
		//	System.out.print("\t");
		}
		
		System.out.println(" ");
	}

	}
	
	public static void inverted () {
		
		
	int k=1;
		
		for(int i=0; i<4; i++)
			
		{
			for(int j=1; j<=i+1; j++)
				
				
			{
				
				System.out.print(k + "   ");
				k= k+1;
			}
			System.out.println( " ");
		}
		
	}
	
	public static void downword () {
		
		
		int k=1;
			
			for(int i=0; i<4; i++)
				
			{
				for(int j=1; j<=4-i; j++)
					
					
				{
					
					System.out.print(k + "   ");
					k= k+1;
				}
				System.out.println( " ");
			}
			
		}
	

	public static void main(String[] args) {
		
	
		Pyramid pd=new Pyramid();
		
	   pd.Sym_Pyramid();
		System.out.println( " ");
		pd.inverted();
		System.out.println( " ");
		pd.downword();

}
	
}