package classMethod.human;

public class Human04 {
	static public int humanCount = 0;
	public String name;
	public static final String GREETING = "‚±‚ñ‚É‚¿‚Í";
	
	public Human04(String name) {
		Human04.humanCount++;
		this.name = name;
	}
	
	static public void staticMethodPrint() {
		System.out.println("l”‚Í" + Human04.humanCount);
	}
	
	public void instanceMethodPrint() {
		System.out.println("–¼‘O‚Í" + name);
		System.out.println("l”‚Í" + Human04.humanCount);
	}
}
