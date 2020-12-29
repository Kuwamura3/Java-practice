package capsule.human;

public class HumanCapsule {
	public String name;
	public int age;

	public HumanCapsule(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
}
