package io;

import java.io.FileOutputStream;

public class FOSTest {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fout = new FileOutputStream("D:\\test1.txt");
		
		/*
		int[] num = {1, 4, -1, 88, 50};
		byte[] b = {7, 51, 3, 4, 1, 24};
		
		// void write(int b) - ���� b�� ���� ���� �״�� ���Ͽ� 1 byte�� ���
		
		for (int i = 0; i < num.length; i++) {
			fout.write(num[i]);
		}
		
		// void write(byte[] b) - ���� b �迭�� ���� �� �״�� ���Ͽ� ��� ���
		fout.write(b);
		*/
		
		// 'a' ~ 'z'���� ���Ͽ� ���
		for (char c = 'a'; c <= 'z'; c++) {
			fout.write(c);	// void write(int b) - char Ÿ�Ե� ������ ������
		}
		
		fout.close();
		
		System.out.println("���Ͽ� ������ ��� �Ϸ�");
		
	}
	
}

























