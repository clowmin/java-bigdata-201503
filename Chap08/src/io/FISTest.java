package io;

import java.io.FileInputStream;

public class FISTest {
	
	public static void main(String[] args) throws Exception {
		
		// C:\Windows\system.ini ���� �о ���
//		FileInputStream fin = new FileInputStream("D:\\test.txt");
		FileInputStream fin = new FileInputStream("C:\\Windows\\system.ini");
		
		while (true) {
			// �����͸� �а�
			int data = fin.read();	// 1 byte�� �о int Ÿ������ ����
									// �� �̻� ���� ���� ������ -1�� ����
			if (data == -1) {
				break;
			}
			// ȭ�鿡 ���
			System.out.print((char) data);	// ���ڷ� ��ȯ���� ���
		}
		
		fin.close();
		
		// fin�� ���ؼ� �� �̻� �����͸� ���� �� ����
	}
	
}
