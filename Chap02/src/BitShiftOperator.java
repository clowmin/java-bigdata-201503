
public class BitShiftOperator {
	
	public static void main(String[] args) {
		
		short a = (short) 0x55ff;
		short b = 0x00ff;
		
		// ��Ʈ ����
		System.out.printf("%x\n", a & b);	// %x : ������ 16���� �������� ���
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", ~a);	// 00000000 00000000 01010101 11111111
										// 11111111 11111111 10101010 00000000 => FFFFAA00
		
		byte c = 20;	// 0x14
		byte d = -8;	// 0xf8
		
		// ����Ʈ ����
		System.out.println(c << 2);	// c�� ������ ��Ʈ�� 2ĭ �������� ����Ʈ
		System.out.println(c >> 2);	// c�� ������ ��Ʈ�� 2ĭ ���������� ����Ʈ
		System.out.println(d >> 2);	// d�� ������ ��Ʈ�� 2ĭ ���������� ����Ʈ
		System.out.printf("%x\n", d >>> 2);
		
	}
	
}
