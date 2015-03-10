package system.apis;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();	// ��ü ���
		
		// �ð� ��ȸ
		// get(int field) �޼ҵ� �̿�
		// ���� �ʵ�� Calendar Ŭ������ ����� ���ǵǾ�����
		
		int year = now.get(Calendar.YEAR);	// �⵵ ��ȸ
		int month = now.get(Calendar.MONTH);	// �� ��ȸ (0: 1��, 1: 2��, ...)
		int day = now.get(Calendar.DAY_OF_MONTH);	// ��
		
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);	// 1: ��, 2: ��, 3: ȭ, ..., 7: ��
		System.out.println(dayOfWeek);
		
//		int hour = now.get(Calendar.HOUR);	// 12�ð��� �ð�
		int hour = now.get(Calendar.HOUR_OF_DAY);	// 24�ð��� �ð�
		int minute = now.get(Calendar.MINUTE);	// ��
		int second = now.get(Calendar.SECOND);	// ��
		
		
		System.out.println("����: " + year + "-" + month + "-" + day
				+ " " + hour + ":" + minute + ":" + second);
		
		System.out.println(
				String.format("����: %04d-%02d-%02d %02d:%02d:%02d",
						year, month, day, hour, minute, second));
		
//		now.add(Calendar.YEAR, 1);	// now +1��
//		now.add(Calendar.DAY_OF_MONTH, 20);	// now +20��
		now.add(Calendar.DAY_OF_MONTH, 300);	// now +300��
		
		System.out.println(now);
		
	}
	
}
