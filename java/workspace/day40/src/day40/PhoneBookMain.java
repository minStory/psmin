package day40;

import java.util.*;

public class PhoneBookMain {
	static HashMap<String, String> hm = new HashMap<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("======전화번호부(" + hm.size() + ")======");
			System.out.println("1. 고객 정보 저장");
			System.out.println("2. 고객 정보 검색");
			System.out.println("3. 고객 정보 출력");
			System.out.println("4. 고객 정보 수정");
			System.out.println("5. 끝내기");
			System.out.print("입력 >>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("------고객 정보 저장------");
				insert();
			} else if (choice == 2) {
				System.out.println("------고객 정보 검색------");
				search();
			} else if (choice == 3) {
				System.out.println("------고객 정보 출력------");
				show();
			} else if (choice == 4) {
				System.out.println("------고객 정보 수정------");
				modify();
			} else if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

	public static void insert() {
		System.out.print("저장할 고개의 이름 >>> ");
		String name = sc.next();
		if (hm.containsKey(name)) {
			System.out.println("이미 존재하는 이름입니다.");
		} else {
			System.out.print("저장할 고객의 번호 >>> ");
			String phone = sc.next();
			hm.put(name, phone);
			System.out.println("저장 완료!");
		}
	}

	public static void search() {
		System.out.println("검색할 이름 >>> ");
		String searchName = sc.next();
		if (hm.containsKey(searchName)) {
			System.out.println("검색된 전화번호 : " + hm.get(searchName));
		} else {
			System.out.println("검색된 이름이 전화번호부에 없습니다.");
		}
	}

	public static void show() {
		Set<String> keySet = hm.keySet();
		Iterator i = keySet.iterator();
		if (hm.isEmpty()) {
			System.out.println("전화번호부가 비었습니다.");
		} else {
			while (i.hasNext()) {
				String curName = (String) i.next();
				System.out.println("이름 : " + curName + ", 전화번호 : " + hm.get(curName));
			}
		}
	}

	public static void modify() {
		System.out.println("1. 이름 수정\n2. 전화번호 수정");
		int choice = sc.nextInt();
		System.out.println("이름 입력 >>> ");
		String name = sc.next();
		if (choice == 1) {
			if (hm.containsKey(name)) {
				System.out.println("새로운 이름 입력 >>> ");
				String modifyName = sc.next();
				hm.put(modifyName, hm.get(name));
				hm.remove(name);
				System.out.println("이름 수정 완료!");
			} else {
				System.out.println("입력하신 이름이 전화번호부에 없습니다.");
			}
		} else if (choice == 2) {
			System.out.println("새로운 전화번호 입력 >>> ");
			String modifyNum = sc.next();
			hm.replace(name, modifyNum);
			System.out.println("전화번호 수정 완료!");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
 