package system.apis;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		// ����
		
		// (1)
		Math.random();
		
		// (2)
		// java.util.Random �̿�
		Random rd = new Random();
		int i = rd.nextInt(100);	// 0~99
		
	}
	
}
