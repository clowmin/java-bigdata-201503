package access.modifier;

public class ClassAccessModifier {
	
	class InnerClass {	// ��ü�� ������ �ִ� Ŭ���� ����
		
	}
	
	public static void main(String[] args) {
		
//		ClassAccessModifier.PrivateInnerClass p
//		= new ClassAccessModifier.PrivateInnerClass();
		
		ClassAccessModifier m = new ClassAccessModifier();
		ClassAccessModifier.InnerClass p = m.new InnerClass();
		
	}
	
}

class DefaultModifierClass {
	
}

//private class PrivateModifierClass {	// �Ұ�
//	
//}

//protected class ProtectedModifierClass {	// �Ұ�
//	
//}
