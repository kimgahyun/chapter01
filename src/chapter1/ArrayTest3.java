package chapter1;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		int 	 arrayInt2[];	//�̰ź���
		//int[10]  arrayInt3;		//����, C�����µ�

		int[]	 arrayInt1;		//�̰Ť���
		arrayInt1 = new int[5];
		arrayInt1[0] = 1;
		arrayInt1[1] = 2;
		arrayInt1[2] = 3;
		arrayInt1[3] = 4;
		arrayInt1[4] = 5;
		
		int[] arrayInt4 = { 1, 2, 3, 4, 5 };
		
		//
		//Book[] books = { new Book(), new Book() };
		String[] month = { "Jan", "Feb", "Mar", "apr", "may" };
		
		//����
		//int[] arrayInt5 = new int[] { 10, 20, 30, 40 };

		// error.  arrayInt6 ���� �̹� null�� ���������		
		//int[] arrayInt6;
		//arrayInt6 = {100, 200, 300, 400 };
	}
}
