package study.object4.vo;

public abstract class Monster {
	
	private String name;
	private int hp;
	
	public Monster() {
		
		
		
	}
	
	public Monster(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	abstract public void die();
	
	abstract public void attack();
	
	abstract public void stat();
	
}
