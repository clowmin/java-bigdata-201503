
public class SalesRevenue {
	
	public static void main(String[] args) {
		
		int[][] sales = {
				{90, 90, 110, 110},		// 1���⵵ �б⺰ ����
				{120, 110, 100, 110},	// 2���⵵ �б⺰ ����
				{120, 140, 130, 150}	// 3���⵵ �б⺰ ����
		};
		
		double sum = 0;	// ���� ����
		
		for (int i = 0; i < sales.length; i++) {	// 1���⵵�� ���� �۾�
			// i == 0 �̶�� sales[i] = {90, 90, 110, 110}
			for (int j = 0; j < sales[i].length; j++) {	// �� �б⿡ ���� �۾�
				sum += sales[i][j];
			}
		}
		// sum�� ��� ���� �հ谡 �����
		
		System.out.println("3�Ⱓ �� �����: " + sum + ", ����� �����: " + (sum / sales.length));
		
	}
	
}
