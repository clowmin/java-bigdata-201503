package inheritance.privatemember;

public class B extends A {
	
	// A�κ��� ��ӹ޴� ���
	// public int p;
	// private int n;
	// public void setN(...){...}
	// public int getN() {...}
	
	// B ���� �߰� ���
	
	// <Alt>+<Shift>+S, R => ��Ŭ������ Generate Getters and Setters ��� Ȱ��
	
	private int m;

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
	public String toString() {
		return getN() + " " + getM();
	}
	
	public void incN() {
//		n++; // �������� private ������� ���� �Ұ�
	}
	
}
