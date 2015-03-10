package maps;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();	// Ű-�� ���� ����Ǵ� �ڷᱸ��
																		// String Ÿ���� Ű, String Ÿ���� ���� ����
		map.put("apple", "���");
		map.put("love", "���");
		map.put("baby", "�Ʊ�");
		
		System.out.println(map);
		
		// V get(K key) - ���ڷ� ���޵� Ű ��ü�� ����� �� ��ü ����
		String value = map.get("love");
		System.out.println(value);
		
		map.put("baby", "���̺�");	// Ű�� �̹� �����ϴ� ���, ���� ���� ��
		
		System.out.println(map);
		
		// void clear()
		
		// contains
		System.out.println(map.containsKey("apple"));
		System.out.println(map.containsValue("����"));
		
		// boolean isEmpty()
		
		// Set<K> keySet()
		Set<String> keys = map.keySet();
		
		// V remove(Object key) - �����κ��� key�� ����� �����͸� ����, ������ �������� ���� ����
		System.out.println("remove() ---------------------");
		String removed = map.remove("apple");
		System.out.println(removed);
		System.out.println(map);
		
		// int size() - ����� ����� ���� ����
		System.out.println(map.size());
		
	}
	
}

























