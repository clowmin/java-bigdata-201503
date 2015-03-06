package inheritance;

public class MusicPhone extends MobilePhone {
	
	// MobilePhone���� ���� �������� ���
	// call() - Phone���κ��� �������� ���
	// answer() - Phone���κ��� �������� ���
	// connectCell()
	// chargeBattery()
	
	private void test() {
		this.call("01012345678");
		this.answer();
		this.connectCell();
		this.chargeBattery();
	}
	
	// ���� �ٿ�ε�
	public void downloadMusic() {
		System.out.println("������ �ٿ�ε��մϴ�.");
	}
	
	// ���� ���
	public void playMusic() {
		System.out.println("������ ����մϴ�.");
	}
	
}
