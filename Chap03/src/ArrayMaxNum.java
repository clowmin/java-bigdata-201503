import java.util.Scanner;

/**
 * ����ڷκ��� ���ڸ� 5�� �Է¹ް�,
 * ���� ū ���ڸ� ����ϴ� ����
 */
public class ArrayMaxNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[10];
		int max = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("���� ������ �Է��ϼ���: ");
			intArray[i] = sc.nextInt();
			
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		
		// ���� ū �� ã��
//		for (int i = 0; i < 5; i++) {
//			if (intArray[i] > max) {
//				max = intArray[i];
//			}
//		}
		
		System.out.println("�Է��� ���� �� ���� ū ����: " + max);
		
//		System.out.println(intArray[6]);
		
		// �迭 �ε����� �ּҰ�: 0
		// �迭 �ε����� �ִ밪: �迭�� ũ�� - 1
		int size = intArray.length;	// �迭�� ũ��
		System.out.println("intArray �迭�� ũ���: " + size);
		
	}
	
}
