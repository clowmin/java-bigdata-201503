import java.io.InputStreamReader;


public class InputExample {
	
	public static void main(String[] args) throws Exception {
		
		InputStreamReader rd = new InputStreamReader(System.in);
		
		while (true) {
			
			int a = rd.read();
			if (a == -1) {	// �� �̻� ���� �����Ͱ� ���� ��� �Ǵ�
							// �ߴ� ��ȣ�� �� ��� (<Ctrl>+Z)
				break;
			}
			
			System.out.println((char)a);	// �Էµ� ���� ���
			
		}
		
	}
	
}
