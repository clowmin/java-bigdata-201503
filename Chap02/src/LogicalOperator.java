
public class LogicalOperator {
	
	public static void main(String[] args) {
		
		// char Ÿ�Գ��� �� => ������ �ڵ尪�� ��
		System.out.println('a' > 'b');	// false
		System.out.println(3 >= 2);		// true
		System.out.println(-1 < 0);		// true
		System.out.println(3.45 <= 2);	// false
		System.out.println(3 == 2);		// false
		System.out.println(3 != 2);		// true
		System.out.println(!(3 != 2));	// false
		
		// ������ AND, OR, XOR ����
		System.out.println((3 > 2) && (3 > 4));	// false
		System.out.println((3 != 2) || (-1 > 0));	// true
		System.out.println((3 != 2) ^ (-1 > 0));	// true
		
	}
	
}
