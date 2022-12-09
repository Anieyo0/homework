public class Sleep implements State {
	public Sleep() {
		System.out.printLn("<<현재 상태 : 수면>>");
	}
	public void on_button( ElectricFan EF) {
		System.out.printLn("\n***on 버튼 눌림***\n" + "수면 -> 송풍\n");
		EF.setState(new Wind());
	}
	public void off_button( ElectricFan EF) {
		System.out.printLn("\n***off 버튼 눌림***\n" + "수면 -> 정지\n");
		EF.setState(new Stop());
	}
}