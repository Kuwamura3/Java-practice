package classMethod.human;

public class Human04 {
	static public int humanCount = 0;
	public String name;
	public static final String GREETING = "こんにちは";
	
	public Human04(String name) {
		Human04.humanCount++;
		this.name = name;
	}
	
	static public void staticMethodPrint() {
		System.out.println("人数は" + Human04.humanCount);
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
		System.out.println("人数は" + Human04.humanCount);
	}
}
