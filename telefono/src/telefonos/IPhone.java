package telefonos;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {

		super(versionNumber, batteryPercentage, carrier, ringTone);

	}

	@Override

	public String ring() {
		return "mensaje ring IPhone";

	}

	@Override

	public String unlock() {

		return "mensaje unlock IPhone";

	}

	@Override

	public void displayInfo() {
		System.out.println("mensaje displayInfo IPhone");
	}

}