package day16;

import java.util.Scanner;		//메서드 입력

public class Cafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//스캐너 sc 생성
		String orderList[] = new String[5];		//주문한 메뉴이름 목록 배열 생성
		int orderPrice[] = new int[5];			//주문한 메뉴가격 목록 배열 생성
		int cnt = 0;				//배열의 Index 구분할 변수 생성
		int total = 0;			//총 금액 변수 생성
		while (true) {		//반복문으로 메인화면 진입
			System.out.println("☆★☆★Cafe☆★☆★");
			System.out.println("1. 주문하기");
			System.out.println("2. 취소하기");
			System.out.println("3. 결제하기");
			System.out.println("4. 종료하기");
			System.out.print("입력 : ");
			int num = sc.nextInt();
			if (num == 1) {		//1. 주문하기 진입
				System.out.println("1. 아메리카노\t3800원");
				System.out.println("2. 에스프레소\t2400원");
				System.out.println("3. 카페라떼\t\t4200원");
				System.out.println("4. 밀크티\t\t5100원");
				while (true) {		//1. 주문하기 반복문 진입
					if (cnt == 5) {		//장바구니가 가득 차있는 경우 메인화면으로 복귀
						System.out.println("장바구니가 가득 찼습니다. 메인화면으로 돌아갑니다.");
						break;
					}
					System.out.print("주문할 번호 입력 : (종료 0)");
					int choice1 = sc.nextInt();		//주문 선택 입력
					if (choice1 == 1) {
						orderList[cnt]="아메리카노";
						orderPrice[cnt]=3800;
					} else if (choice1 == 2) {
						orderList[cnt]="에스프레소";
						orderPrice[cnt]=2400;
					} else if (choice1 == 3) {
						orderList[cnt]="카페라떼";
						orderPrice[cnt]=4200;
					} else if (choice1 == 4) {
						orderList[cnt]="밀크티";
						orderPrice[cnt]=5100;
					} else if (choice1 == 0) {
						System.out.println("주문하기를 종료합니다.");
						break;
					} else {		//잘못 입력 시 밑의 명령 생략 후 반복문 상단으로 이동
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
					System.out.println("장바구니에 " + orderList[cnt] + "가 추가되었습니다.");
					System.out.println("가격은" + orderPrice[cnt] + "원 입니다.");
					total += orderPrice[cnt];		//전체 가격에 가격 대입
					cnt++;		//cnt 증가시켜 Index 구분
				}
			} else if (num == 2) {		//2. 취소하기 진입
				while (true) {		//2. 취소하기 반복문 진입
					if (cnt == 0) {		//장바구니가 비어있는 경우 메인화면으로 복귀
						System.out.println("장바구니가 비었습니다. 메인화면으로 돌아갑니다.");
						break;
					}
					System.out.println("----------장바구니 목록----------");
					for (int i = 0; i < cnt; i++) {		//주문 목록 표시
						System.out.println(i + 1 + ". " + orderList[i]);
					}
					System.out.print("주문 취소할 번호 입력 : (종료 0)");
					int choice2 = sc.nextInt();		//취소할 메뉴 번호 입력
					if (choice2 >= 1 && choice2 <= 5) {		//메뉴 번호 입력시 전체 가격에서 해당 가격 제외
						total -= orderPrice[choice2 - 1];
					} else if (choice2 == 0) {
						System.out.println("취소하기를 종료합니다.");
						break;
					} else {		//잘못 입력 시 밑의 명령 생략 후 반복문 상단으로 이동
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
					for (int i = choice2 - 1; i < cnt-1; i++) {		//메뉴 제거 후 뒤의 메뉴를 한칸 앞으로 당겨오기
						orderList[i] = orderList[i + 1];			//메뉴 리스트 당기기
						orderPrice[i] = orderPrice[i + 1];			//메뉴 가격 당기기
					}
					cnt--;		//cnt 감소 시켜 장바구니 목록 개수 구분
				}
			} else if (num == 3) {		//3. 결제하기 진입
				while (true) {		//3. 결제하기 반복문 진입
					if (cnt == 0) {		//장바구니가 비었을 경우 메인화면으로 복귀
						System.out.println("장바구니가 비었습니다. 메인화면으로 돌아갑니다.");
						break;
					}
					System.out.println("총 금액 : " + total + "원");		//총 금액 출력
					System.out.print("지불할 금액 입력 : ");
					int pay = sc.nextInt();		//지불할 금액 입력
					if (pay < total) {		//지불한 금액이 적을 때 
						System.out.println("금액이 모자랍니다. 다시 입력해주세요.");
					} else if (pay >= total) {		//지불한 금액이 많거나 같을 때
						System.out.println("계산이 완료되었습니다. 감사합니다.\n거스름돈 : " + (pay - total) + "원");
						total = 0;		//계산 완료 후 가격 초기화
						cnt = 0;			//계산 완료 후 장바구니 개수 초기화
						for (int i = 0; i < 5; i++) {
							orderList[i] = "";		//계산 완료 후 주문 목록 초기화
							orderPrice[i] = 0;		//계산 완료 후 가격 목록 초기화
						}
						break;
					}
				}
			} else if (num == 4) {		//4. 종료하기 실행 -> 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {		//잘못 입력 시 반복문 최상단으로 이동
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
