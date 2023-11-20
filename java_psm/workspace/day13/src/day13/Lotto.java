package day13;

import java.util.*;		//Random 클래스와 Scanner 클래스 2개 필요하므로 모든 클래스인 *로 사용

public class Lotto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int lotto[]=new int[6];
		int user[]=new int[6];
		int cnt=0;
		int lottoBonus=0;
		int userBonus=0;
		
		lottoBonus=random.nextInt(45)+1;		//보너스 번호 생성
		
		for(int i=0 ; i<lotto.length ; i++) {	//로또번호 랜덤 생성
			lotto[i]=random.nextInt(45)+1;
			for(int j=0 ; j<i ; j++) {			//같은 번호 생성시 다시 생성
				if(lotto[i]==lotto[j] || lottoBonus==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("로또 번호 : "+Arrays.toString(lotto)+" 보너스 : "+lottoBonus);
		System.out.println("로또 번호를 입력하세요 : ");
		for(int i=0 ; i<user.length ; i++) {	//사용자 로또 번호 입력
			user[i]=sc.nextInt();
				}
		for(int i=0 ; i<user.length ; i++) {	//로또번호와 사용자번호 비교
			for(int j=0 ; j<lotto.length ; j++) {
				if(user[i]==lotto[j]) {			//번호가 일치할 때 맞춘 개수 카운팅
					cnt++;
				}
			}
			if(user[i]==lottoBonus) {		//보너스번호 맞췄을 때 보너스값 카운팅
				userBonus++;
			}
		}
		if(cnt==6) {
			System.out.println("1등입니다.");
		}
		else if(cnt==5&&userBonus==1) {
			System.out.println("2등입니다.");
		}
		else if(cnt==5) {
			System.out.println("3등입니다.");
		}
		else if(cnt==4) {
			System.out.println("4등입니다.");
		}
		else if(cnt==3) {
			System.out.println("5등입니다.");
		}
		else {
			System.out.println("꽝");
		}
	}
}
