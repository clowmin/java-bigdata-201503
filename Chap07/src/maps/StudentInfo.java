package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student {
	int id;			// �й�
	String tel;		// ��ȭ��ȣ
	String name;	// �̸�
	String dept;	// �а�
	
	public Student(int id, String tel, String name, String dept) {
		this.id = id;
		this.tel = tel;
		this.name = name;
		this.dept = dept;
	}
	
	public String toString() {	// Object�� toString() �޼ҵ带 ������(overriding)
		return "(" + id + "," + tel + "," + dept + ")";
	}
}

public class StudentInfo {
	
	public static void main(String[] args) {
		
		// �л� ������ ������ Map ��ü ����
		HashMap<String, Student> infos = new HashMap<String, Student>();
		
		infos.put("ȫ�浿", new Student(1001, "010-1111-1111", "ȫ�浿", "�İ�"));
		infos.put("��û", new Student(1002, "010-2222-2222", "��û", "����"));
		infos.put("�̸���", new Student(1006, "010-3000-3000", "�̸���", "����"));
		
		System.out.println(infos);
		
		// �ʿ� ����� ��� ��Ҹ� ���������� ����
		Set<String> keys = infos.keySet();
		// Ű�� ���� Iterator ��ü
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();	// ���� Ű ������
			Student value = infos.get(key);	// �ʿ��� ������ ���� Ű�� �� ��ȸ
			System.out.println(key + ": " + value);
		}
		
	}
	
}






















