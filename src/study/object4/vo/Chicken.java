package study.object4.vo;

public class Chicken extends Monster{
	
	private String name;
	private int hp = 10;
	
	public Chicken() {
		
		
		
	}
	
	public Chicken(String name, int hp) {
		super(name,hp);
		System.out.println("���� ��Ÿ����.");
		
	}
	
	@Override
	public void die() {
		System.out.println("���� �׾���.");
		
	}

	@Override
	public void attack() {
		System.out.println("����~~��..");
		
	}

	@Override
	public void stat() {
		System.out.println("=================================");
		System.out.println("���� ü��: " + hp);
		
	}
	
}
