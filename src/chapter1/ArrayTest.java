package chapter1;

public class ArrayTest {

	public static void main(String[] args) {
		int[] scores = new int[5];
		
		scores[0] = 10;
		scores[1] = 10;
		scores[2] = 10;
		scores[3] = 10;
		scores[4] = 10;
//	error
//		scores[5] = 10;
		
		int sum = 0;
		int size = scores.length;
		System.out.println( size );
		for( int i = 0; i < size; i ++)
		{
			sum += scores[i];
		}
		System.out.println( sum );
	}

}
