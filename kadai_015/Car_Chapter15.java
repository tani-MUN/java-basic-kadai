package text.kadai_015;

public class Car_Chapter15 {
	private int gear=1;
	private int speed=10;
	
	public Car_Chapter15(int gear) {
		this.gear=gear;
	}
	
	public void gearChange(int afterGear) {
		switch(afterGear) {
		case 1 -> {
			System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
			speed=10;
			gear=1;
		}
		case 2 -> {
			System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
			speed=20;
			gear=2;
		}
		case 3 -> {
			System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
			speed=30;
			gear=3;
		}
		case 4 -> {
			System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
			speed=40;
			gear=4;
		}
		case 5 -> {
			System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
			speed=50;
			gear=5;
		}
		default -> speed=10;
		}
	}
	public void run() {
		System.out.println("速度は時速"+speed+"kmです");
	}
	
}
