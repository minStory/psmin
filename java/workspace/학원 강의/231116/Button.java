package parkseongmin;

public class Button {	//�ܺ�Ŭ����
	//���������� �������̽��� �����.
	public static interface ClickListener{
		//�߻�޼���
		void onClick();
	}
	
	//������ ��ü�� ���Թ��� �� �ִ� ������ �����.
	private ClickListener clickListener;
	//��ü�� �����ϴ� Setter �޼���
	public void setClickListener(ClickListener clickListener) {
		//���� ��ü�� ������ �´�.
		this.clickListener=clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
}
