package day16;

import java.util.Scanner;		//�޼��� �Է�

public class Cafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��ĳ�� sc ����
		String orderList[] = new String[5];		//�ֹ��� �޴��̸� ��� �迭 ����
		int orderPrice[] = new int[5];			//�ֹ��� �޴����� ��� �迭 ����
		int cnt = 0;				//�迭�� Index ������ ���� ����
		int total = 0;			//�� �ݾ� ���� ����
		while (true) {		//�ݺ������� ����ȭ�� ����
			System.out.println("�١ڡ١�Cafe�١ڡ١�");
			System.out.println("1. �ֹ��ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. �����ϱ�");
			System.out.print("�Է� : ");
			int num = sc.nextInt();
			if (num == 1) {		//1. �ֹ��ϱ� ����
				System.out.println("1. �Ƹ޸�ī��\t3800��");
				System.out.println("2. ����������\t2400��");
				System.out.println("3. ī���\t\t4200��");
				System.out.println("4. ��ũƼ\t\t5100��");
				while (true) {		//1. �ֹ��ϱ� �ݺ��� ����
					if (cnt == 5) {		//��ٱ��ϰ� ���� ���ִ� ��� ����ȭ������ ����
						System.out.println("��ٱ��ϰ� ���� á���ϴ�. ����ȭ������ ���ư��ϴ�.");
						break;
					}
					System.out.print("�ֹ��� ��ȣ �Է� : (���� 0)");
					int choice1 = sc.nextInt();		//�ֹ� ���� �Է�
					if (choice1 == 1) {
						orderList[cnt]="�Ƹ޸�ī��";
						orderPrice[cnt]=3800;
					} else if (choice1 == 2) {
						orderList[cnt]="����������";
						orderPrice[cnt]=2400;
					} else if (choice1 == 3) {
						orderList[cnt]="ī���";
						orderPrice[cnt]=4200;
					} else if (choice1 == 4) {
						orderList[cnt]="��ũƼ";
						orderPrice[cnt]=5100;
					} else if (choice1 == 0) {
						System.out.println("�ֹ��ϱ⸦ �����մϴ�.");
						break;
					} else {		//�߸� �Է� �� ���� ��� ���� �� �ݺ��� ������� �̵�
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						continue;
					}
					System.out.println("��ٱ��Ͽ� " + orderList[cnt] + "�� �߰��Ǿ����ϴ�.");
					System.out.println("������" + orderPrice[cnt] + "�� �Դϴ�.");
					total += orderPrice[cnt];		//��ü ���ݿ� ���� ����
					cnt++;		//cnt �������� Index ����
				}
			} else if (num == 2) {		//2. ����ϱ� ����
				while (true) {		//2. ����ϱ� �ݺ��� ����
					if (cnt == 0) {		//��ٱ��ϰ� ����ִ� ��� ����ȭ������ ����
						System.out.println("��ٱ��ϰ� ������ϴ�. ����ȭ������ ���ư��ϴ�.");
						break;
					}
					System.out.println("----------��ٱ��� ���----------");
					for (int i = 0; i < cnt; i++) {		//�ֹ� ��� ǥ��
						System.out.println(i + 1 + ". " + orderList[i]);
					}
					System.out.print("�ֹ� ����� ��ȣ �Է� : (���� 0)");
					int choice2 = sc.nextInt();		//����� �޴� ��ȣ �Է�
					if (choice2 >= 1 && choice2 <= 5) {		//�޴� ��ȣ �Է½� ��ü ���ݿ��� �ش� ���� ����
						total -= orderPrice[choice2 - 1];
					} else if (choice2 == 0) {
						System.out.println("����ϱ⸦ �����մϴ�.");
						break;
					} else {		//�߸� �Է� �� ���� ��� ���� �� �ݺ��� ������� �̵�
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						continue;
					}
					for (int i = choice2 - 1; i < cnt-1; i++) {		//�޴� ���� �� ���� �޴��� ��ĭ ������ ��ܿ���
						orderList[i] = orderList[i + 1];			//�޴� ����Ʈ ����
						orderPrice[i] = orderPrice[i + 1];			//�޴� ���� ����
					}
					cnt--;		//cnt ���� ���� ��ٱ��� ��� ���� ����
				}
			} else if (num == 3) {		//3. �����ϱ� ����
				while (true) {		//3. �����ϱ� �ݺ��� ����
					if (cnt == 0) {		//��ٱ��ϰ� ����� ��� ����ȭ������ ����
						System.out.println("��ٱ��ϰ� ������ϴ�. ����ȭ������ ���ư��ϴ�.");
						break;
					}
					System.out.println("�� �ݾ� : " + total + "��");		//�� �ݾ� ���
					System.out.print("������ �ݾ� �Է� : ");
					int pay = sc.nextInt();		//������ �ݾ� �Է�
					if (pay < total) {		//������ �ݾ��� ���� �� 
						System.out.println("�ݾ��� ���ڶ��ϴ�. �ٽ� �Է����ּ���.");
					} else if (pay >= total) {		//������ �ݾ��� ���ų� ���� ��
						System.out.println("����� �Ϸ�Ǿ����ϴ�. �����մϴ�.\n�Ž����� : " + (pay - total) + "��");
						total = 0;		//��� �Ϸ� �� ���� �ʱ�ȭ
						cnt = 0;			//��� �Ϸ� �� ��ٱ��� ���� �ʱ�ȭ
						for (int i = 0; i < 5; i++) {
							orderList[i] = "";		//��� �Ϸ� �� �ֹ� ��� �ʱ�ȭ
							orderPrice[i] = 0;		//��� �Ϸ� �� ���� ��� �ʱ�ȭ
						}
						break;
					}
				}
			} else if (num == 4) {		//4. �����ϱ� ���� -> ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {		//�߸� �Է� �� �ݺ��� �ֻ������ �̵�
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}
