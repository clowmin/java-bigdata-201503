package inheritance.downcasting;

public abstract class Shape {	// "����"�̶�� ������ ��Ÿ�� Ŭ����
	
	protected double area;		// ����
	protected double circum;	// �ѷ�
	
	public void display() {
		System.out.println("����: " + area + ", �ѷ�: " + circum);
	}
	
	protected abstract void makeArea();
	/*
	{
		System.out.println("Shape�� makeArea()");
		// ������ ������ �����Ǳ� ������ ������ ����� �� ����
	}*/
	
	protected abstract void makeCircum();
	/*
	{
		System.out.println("Shape�� makeCircum()");
		// ������ ������ �����Ǳ� ������ �ѷ��� ����� �� ����
	}
	*/
	
	public double getArea() {
		return area;
	}
	
	public double getCircum() {
		return circum;
	}
	
}
