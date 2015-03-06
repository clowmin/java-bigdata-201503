
public class Circle {
	
	// �ν��Ͻ� ����
	double radius;	// ������
	double area;	// ����
	
	// ������
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// set�ʵ��̸�() : setter, �ʵ忡 ���� ������ �� �ִ� �޼ҵ�
	
	public Circle setRadius(double radius) {
		this.radius = radius;
		return this;
	}
	
	// getters - �ʵ� ���� ��ȸ�ϴ� �޼ҵ�
	public double getRadius() { return radius; }
	public double getArea() { return area; }
	
	public Circle calcArea() {	// �ʵ� radius�� �̿��ؼ� ���� ����ϴ� �޼ҵ�
		area = Math.PI * radius * radius;
		return this;
	}
	
	public Circle display() {
		System.out.println("�� ���� ������: " + radius + ", ����: " + area);
		return this;
	}
	
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(3.0);
//		c1.calcArea();
//		c1.display();
//		
//		c1.setRadius(10.0);
//		c1.calcArea();
//		c1.display();
		
		c1.calcArea().display().setRadius(10.0).calcArea().display();
		
	}
	
}
