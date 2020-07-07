package study.object.object2.vo;

public class Mammalia extends DongMul{
	
	private String name;
	private String kinds;
	private int age;
	private String breeding;
	private String location;
	
	public Mammalia() {
		
	}

	public Mammalia(String name, String kinds, int age, String breeding, String location) {
		super(name,kinds,age,breeding,location);
		System.out.println("포유류입니다.");
	}
	
}
