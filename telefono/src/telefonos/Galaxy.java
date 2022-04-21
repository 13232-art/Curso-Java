package telefonos;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {

		super(versionNumber, batteryPercentage, carrier, ringTone);

	}

	@Override

	public String ring() {
		return "mensaje ring Galaxy";

	}

	@Override

	public String unlock() {
		return "mensaje unlock Galaxy";

	}

	@Override

	public void displayInfo() {
		System.out.println("mensaje displayInfo Galaxy");
	}

}

