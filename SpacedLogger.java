package W5Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String input) {
		System.out.println(space(input));
		
	}

	@Override
	public void error(String eInput) {
		System.out.println("ERROR: "+ space(eInput));
		
	}
	public static String space (String word) {
		String longer = "";
		for(int i = 0; i < word.length(); i++) {
			if (i < word.length()-1) {
			longer += word.charAt(i) + " ";}
			else {
				longer += word.charAt(i);
			}
	}
		return longer;
	}
}
