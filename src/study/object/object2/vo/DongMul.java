package study.object.object2.vo;

public class DongMul {
	
	private String name;
	private String kinds;
	private int age;
	private String breeding;
	private String location;
	
	public DongMul() {
		
	}

	public DongMul(String name, String kinds, int age, String breeding, String location) {
		super();
		this.name = name;
		this.kinds = kinds;
		this.age = age;
		this.breeding = breeding;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	//출력예: 이름: 고릴라 종류: 포유류 나이: 2살 번식: 새끼를 낳는다 서식지: 정글
	public String getBreeding() {
		return breeding;
	}

	public void setBreeding(String breeding) {
		this.breeding = breeding;
	}

	public String getInfomation() {
		
		return "이름: " + name + " 종류: " + kinds + " 나이: " + age
				+ " 번식: " + breeding + " 서식지: " + location;
		
	}
	
	
	
}
