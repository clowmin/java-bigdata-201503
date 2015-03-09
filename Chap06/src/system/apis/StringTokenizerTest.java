package system.apis;

import java.util.*;

public class StringTokenizerTest {
	
	public static void main(String[] args) {
		
		String query = "name=gdhong&addr=hanyang&age=27";
		
		StringTokenizer st = null;
//		st = new StringTokenizer(query);	// ���鹮�ڷ� ��������
		st = new StringTokenizer(query, "&");
//		st = new StringTokenizer(query, "&", true);
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			// token ó��
			System.out.println(token);
		}
		
		
	}
	
}
