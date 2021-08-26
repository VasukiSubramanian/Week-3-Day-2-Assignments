package week3.day2.assignments;

public class Desktop implements HardWare, SoftWare {

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();
	}

	public void softwareResources() {
		System.out.println("SoftWare Resources");
	}

	public void hardwareResources() {
		System.out.println("HardWare Resources");
	}

	public void desktopModel() {
		System.out.println("Desktop Model");
	}

}
