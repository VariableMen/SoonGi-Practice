package study.object4.vo;

public class Lion extends Monster{
	
	private String name;
	private int hp = 300;
	
	public Lion() {
		
		
		
	}

	public Lion(String name, int hp) {
		super(name,hp);
	}

	@Override
	public void die() {
		System.out.println("���ڰ� �׾���.");
		
	}

	@Override
	public void attack() {
		System.out.println("����~~ ũ���");
		
	}

	@Override
	public void stat() {
		System.out.println("������ ü��: " + hp);
		
	}
	
}	
