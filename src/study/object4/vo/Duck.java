package study.object4.vo;

public class Duck extends Monster{
	
	private String name;
	private int hp = 20;
	
	public Duck() {
		
		
		
	}

	public Duck(String name, int hp) {
		super(name,hp);
	}

	@Override
	public void die() {
		System.out.println("������ �׾���.");
		
	}

	@Override
	public void attack() {
		System.out.println("��~~��~~~");
		
	}

	@Override
	public void stat() {
		System.out.println("=================================");
		System.out.println("���� ü��: " + hp);
		
	}
	
}
