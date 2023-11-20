package day40;

import java.util.*;

public class PhoneBookMain {
	static HashMap<String, String> hm = new HashMap<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("======��ȭ��ȣ��(" + hm.size() + ")======");
			System.out.println("1. �� ���� ����");
			System.out.println("2. �� ���� �˻�");
			System.out.println("3. �� ���� ���");
			System.out.println("4. �� ���� ����");
			System.out.println("5. ������");
			System.out.print("�Է� >>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("------�� ���� ����------");
				insert();
			} else if (choice == 2) {
				System.out.println("------�� ���� �˻�------");
				search();
			} else if (choice == 3) {
				System.out.println("------�� ���� ���------");
				show();
			} else if (choice == 4) {
				System.out.println("------�� ���� ����------");
				modify();
			} else if (choice == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}

	public static void insert() {
		System.out.print("������ ���� �̸� >>> ");
		String name = sc.next();
		if (hm.containsKey(name)) {
			System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
		} else {
			System.out.print("������ ���� ��ȣ >>> ");
			String phone = sc.next();
			hm.put(name, phone);
			System.out.println("���� �Ϸ�!");
		}
	}

	public static void search() {
		System.out.println("�˻��� �̸� >>> ");
		String searchName = sc.next();
		if (hm.containsKey(searchName)) {
			System.out.println("�˻��� ��ȭ��ȣ : " + hm.get(searchName));
		} else {
			System.out.println("�˻��� �̸��� ��ȭ��ȣ�ο� �����ϴ�.");
		}
	}

	public static void show() {
		Set<String> keySet = hm.keySet();
		Iterator i = keySet.iterator();
		if (hm.isEmpty()) {
			System.out.println("��ȭ��ȣ�ΰ� ������ϴ�.");
		} else {
			while (i.hasNext()) {
				String curName = (String) i.next();
				System.out.println("�̸� : " + curName + ", ��ȭ��ȣ : " + hm.get(curName));
			}
		}
	}

	public static void modify() {
		System.out.println("1. �̸� ����\n2. ��ȭ��ȣ ����");
		int choice = sc.nextInt();
		System.out.println("�̸� �Է� >>> ");
		String name = sc.next();
		if (choice == 1) {
			if (hm.containsKey(name)) {
				System.out.println("���ο� �̸� �Է� >>> ");
				String modifyName = sc.next();
				hm.put(modifyName, hm.get(name));
				hm.remove(name);
				System.out.println("�̸� ���� �Ϸ�!");
			} else {
				System.out.println("�Է��Ͻ� �̸��� ��ȭ��ȣ�ο� �����ϴ�.");
			}
		} else if (choice == 2) {
			System.out.println("���ο� ��ȭ��ȣ �Է� >>> ");
			String modifyNum = sc.next();
			hm.replace(name, modifyNum);
			System.out.println("��ȭ��ȣ ���� �Ϸ�!");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
 