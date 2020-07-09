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
		System.out.println("사자가 죽었다.");
		
	}

	@Override
	public void attack() {
		System.out.println("어흥~~ 크어얽");
		
	}

	@Override
	public void stat() {
		System.out.println("사자의 체력: " + hp);
		
	}
	
}	
