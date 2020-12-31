package practice;

public interface Flying {
	void fly();
	
	default void powerOff() {
		System.out.println("”ò‚ñ‚Å‚¢‚éê‡‚Í—‰º‚µ‚Ü‚·B");
	}
}
