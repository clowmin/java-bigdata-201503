package inheritance;

public class MobilePhone extends Phone {
	
	// Phone���κ��� �����޴� ���
	// call()
	// answer()
	
	private void test() {	// �������� ��� Ȯ��
		this.call("01012341234");
		this.answer();
	}
	
	// ���� ������ ����
	public void connectCell() {
		System.out.println("���� �������� �����մϴ�.");
	}
	
	// ���͸� �����ϱ�
	public void chargeBattery() {
		System.out.println("���͸��� �����մϴ�.");
	}
	
}
