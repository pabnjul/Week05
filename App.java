package W5Assignment;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		
		logger.log("Julie");
		logger.error("Palmandez");
		
		Logger log2 = new SpacedLogger();
		
		log2.log("Is");
		log2.error("Awesome");
		

	}

}
