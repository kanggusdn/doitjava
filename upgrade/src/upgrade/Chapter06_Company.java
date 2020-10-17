package upgrade;

public class Chapter06_Company {
	private static Chapter06_Company instance = new Chapter06_Company();

	private Chapter06_Company() {
	}

	public static Chapter06_Company getInstance() {
		if (instance == null) {
			instance = new Chapter06_Company();
		}
		return instance;
	}
}
