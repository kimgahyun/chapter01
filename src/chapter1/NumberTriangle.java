package chapter1;

public class NumberTriangle {

	public static void main(String[] args) {
		if( args.length != 1 )
		{
			System.out.println("java NumberTriangle [N] : N:����");
			return;
		}
		
		int count = Integer.parseInt( args[0] );
		//System.out.println(count);
		
		for( int i = 1; i <= count; i++)
		{
			for( int j = 0; j < i; j++ )
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
