package study;

public class Array {

	//�迭�� �ݺ����� ����Ͽ� �ٳ���, ������, �ڵ�, ������ �����ÿ�.
	//�ٳ����� ����ϸ� �ٳ��� �ڿ� ������
	//�����Ƹ� ����ϸ� ������ �ڿ� �Ǿ�
	//�ڵθ� ����ϸ� �ڵ� �ڿ� ����
	//������ ����ϸ� ���� �ڿ� ��¡� ����Ͻÿ�.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void test1() {
		
		String str[] = new String[4];
	
		for(int i = 0; i < str.length; i++) {
			
			if(i == 0) {
				
				str[i] = ("�ٳ���");
				System.out.println(str[i] + "������");
			}
			
			if(i == 1) {
				
				str[i] = ("������");
				System.out.println(str[i] + "�Ǿ�");
			}
			
			if(i == 2) {
				
				str[i] = ("�ڵ�");
				System.out.println(str[i] + "����");
			}
			
			if(i == 3) {
				
				str[i] = ("����");
				System.out.println(str[i] + "��¡��");
			}
			
			
			
			
		}
		
	}
	
	
	
	//2���� �迭�� Ȱ���Ͽ� ���� ���� 
	//		*        
	//		* *      
	//		* * *	   
	//      * * * *  
	//	    * * * * * 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	public void test2() {
		String star[][] = new String[5][9];
		
		for(int i = 0; i < star.length; i++) {
			
			
			
			for(int j = 0; j <= i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Array ar = new Array();
//		ar.test1();
		ar.test2();

	}

}
