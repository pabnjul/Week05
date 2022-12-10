package W5Assignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String input) {
		System.out.println("***" + input + "***");
		
	}

	@Override
	public void error(String eInput) {
		starry(eInput);
		System.out.println("\n***ERROR: " + eInput + "***\n");
		starry(eInput);
		
	}
	public static void starry (String word) {
		String stars = "";
		for(int i = 0; i < word.length() + 13; i++) {
			stars += "*";
		} System.out.println(stars);
	}
	}
