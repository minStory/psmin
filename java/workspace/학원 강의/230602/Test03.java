//������ ��¿ �� ������, ���ܴ� �ݵ�� ó������
//try{
//		���ΰ��� ��
//}
//catch(���� ���� ���){
//			�ƺ����� ������
//}
//catch(���ϴ� ������ ���� ���){
//			���� �´�
//}
//���� ó�� ���
//1. try-catch�� (���� ó��)
//2. ���� �����ϱ� (���� ���ѱ��(�˸���))
//3. ���� ���� (�� try-catch�� ���)

//���� �߻���ŰŰ
//Ű���� throw ����Ͽ� ���α׷��Ӱ� ���Ƿ� ���� �߻���Ŵ
//1. ������ new�� �̿��ؼ� �߻���Ű���� ���� Ŭ������ ��ü�� �����.
//EXception e = new Exception("���Ƿ� �߻���Ŵ");
//2. Ű���� throw�� �̿��ؼ� ���ܸ� �߻���Ų��.
//throw e;

//1. ���� Exception�� RuntimeException ������ ���α׷��Ӱ� �Ѵ�.
//	try-catch��
//2. String �����ڸ� �־�����Ѵ�.

package day_0602;

public class Test03 {

	public static void main(String[] args) {
		try {
			Exception e=new Exception("���� ����");
			throw e;
		}catch(Exception e) {
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());
		}
	}
}
