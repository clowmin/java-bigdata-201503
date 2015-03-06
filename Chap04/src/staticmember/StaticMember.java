package staticmember;

class CurrencyConverter {
	private static double rate;	// ��-�޷� ȯ�� 1098.30��/�޷�
	
	public static double toDollar(double won) {	// ��ȭ�� �޷���
		return won / rate;
	}
	
	public static double toKRW(double dollar) {	// �޷��� ��ȭ��
		return dollar * rate;
	}
	
	public static void setRate(double r) {	// ȯ�� ����
		rate = r;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		CurrencyConverter.setRate(1098.30);
		System.out.println("�鸸���� " + CurrencyConverter.toDollar(1000000) + "�޷��Դϴ�.");
		System.out.println("õ�޷��� " + CurrencyConverter.toKRW(1000) + "���Դϴ�.");
	}
}
