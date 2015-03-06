import java.util.Scanner;


public class GoodsArray {
	
	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];	// 3���� Goods ��ü�� ���� �迭 ����
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < goodsArray.length; i++) {
			// Goods ��ü 1���� ����� ���� ���ڸ� �Է� �ޱ�
			System.out.println("��ǰ ������ \"��ǰ�� ���� ��� �Ǹŷ�\"�� �������� �Է��ϼ���.");
			String name = sc.next();
			int price = sc.nextInt();
			int numOfStock = sc.nextInt();
			int sold = sc.nextInt();
			Goods g = new Goods(name, price, numOfStock, sold);
			goodsArray[i] = g;
		}
		
		sc.close();	// Ű���� �Է� �ڿ� �ݳ�
		
		// goodsArray�� ��3���� Goods ��ü�� �� ��ҷ� �ϴ� �迭
		
		// ��ȸ
		// for-each ����
		for (Goods g : goodsArray) {
			System.out.print("��ǰ��: " + g.getName() + ", ");
			System.out.print("����: " + g.getPrice() + ", ");
			System.out.print("���: " + g.getNumberOfStock() + ", ");
			System.out.println("�Ǹ�: " + g.getSold());
		}
		
	}
	
}

class Goods {
	// private: ���� Ŭ������ �ܺο��� �������� ���ϵ���
	
	private String name;	// ��ǰ��
	private int price;		// ����
	private int numberOfStock;	// ���
	private int sold;	// �Ǹŷ�
	
	Goods(String n, int p, int nStock, int s) {
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}
	
	// get�ʵ��() �̶�� ���� �޼ҵ带 "getter"
	// getter �޼ҵ�� �ʵ� ���� ��ȸ�� �� �ֵ��� �ϴ� �޼ҵ�
	
	String getName() {	// �ڽ��� name �ʵ忡 ����� �����͸� �����ؼ� �ܺη� ����
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	int getNumberOfStock() {
		return numberOfStock;
	}
	
	int getSold() {
		return sold;
	}
	
}



















