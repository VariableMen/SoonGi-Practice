package study.object.object2.vo;

public class Reptila extends DongMul{
	
	private String name;
	private String kinds;
	private int age;
	private String breeding;
	private String location;
	
	public Reptila() {
		
	}

	public Reptila(String name, String kinds, int age, String breeding, String location) {
		super(name,kinds,age,breeding,location);
		System.out.println("파충류입니다.");

	}
	
}
