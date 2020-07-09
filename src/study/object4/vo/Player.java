package study.object4.vo;

public class Player {
	
	private String name;
	private int hp = 100;
	private int power = 10;
	
	public Player() {
		
	}

	public Player(String name, int hp, int power) {
		super();
		this.name = name;
		this.hp = hp;
		this.power = power;
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

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void stat() {
		
		System.out.println("--------------------------------------");
		System.out.println("닉네임: " + getName());
		System.out.println("HP: " + getHp());
		System.out.println("공격력: " + getPower());
		System.out.println("--------------------------------------");
	}
	
}
