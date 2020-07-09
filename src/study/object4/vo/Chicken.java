package study.object4.vo;

public class Chicken extends Monster{
	
	private String name;
	private int hp = 10;
	
	public Chicken() {
		
		
		
	}
	
	public Chicken(String name, int hp) {
		super(name,hp);
		System.out.println("´ßÀÌ ³ªÅ¸³µ´Ù.");
		
	}
	
	@Override
	public void die() {
		System.out.println("´ßÀÌ Á×¾ú´Ù.");
		
	}

	@Override
	public void attack() {
		System.out.println("²¿²¿~~´ì..");
		
	}

	@Override
	public void stat() {
		System.out.println("=================================");
		System.out.println("´ßÀÇ Ã¼·Â: " + hp);
		
	}
	
}
