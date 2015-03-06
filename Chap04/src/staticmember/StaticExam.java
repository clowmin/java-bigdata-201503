package staticmember;

class StaticSample {
	// non-static ��� / �ν��Ͻ� ���
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	
	// static ��� / Ŭ���� ���
	public static int m;
	public static void f() {
		m = 5;
	}
}

public class StaticExam {
	
	public static void main(String[] args) {
		/*
		StaticSample s1 = new StaticSample(), s2 = new StaticSample();
		
		s1.n = 5;	// �ν��Ͻ� ���� n�� ���� 5�� ����
		s1.g();		// �ν��Ͻ� �޼ҵ� g�� ȣ��
		s1.m = 50;	// static - Ŭ���� ���� m�� ���� 50���� ����
		
		s2.n = 8;
		s2.h();
		s2.f();		// static
		
		System.out.println(s1.m);
		*/
		
		StaticSample.m = 10;
		
		StaticSample s1 = new StaticSample();
		System.out.println(s1.m);
		s1.f();
		
		StaticSample.f();
		
	}
	
}
