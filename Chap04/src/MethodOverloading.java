
public class MethodOverloading {
	
	public static void main(String[] args) {
		
		MethodSample m = new MethodSample();
		
//		int a = m.getSum(1, 2);
//		int b = m.getSum(3, 4, 5);
		double c = m.getSum(1.1, 2.2);
		
	}
	
}

class MethodSample {
	
	public int getSum(int i, int j) {
		System.out.println("int�� ���� 2��¥�� getSum");
		return i + j;
	}
	
	public int getSum(int i, int j, int k) {
		System.out.println("int�� ���� 3��¥�� getSum");
		return i + j + k;
	}
	
	public double getSum(double i, double j) {
		System.out.println("double�� ���� 2��¥�� getSum");
		return i + j;
	}
	
}
