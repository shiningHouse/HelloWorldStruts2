package practice;


class Enclosignoe{
	// �Ǿ�̬�ڲ���
	public class InsideOne{}
	// ��̬�ڲ���
	public static class InsideTwo{}
}


public class InnerClassTest {
	public static void main(String args[]){
		Enclosignoe.InsideOne obj1 = new Enclosignoe().new InsideOne();  // �Ǿ�̬�ڲ������
		Enclosignoe.InsideTwo obj2 = new Enclosignoe.InsideTwo();  // ��̬�ڲ������
	}
}
