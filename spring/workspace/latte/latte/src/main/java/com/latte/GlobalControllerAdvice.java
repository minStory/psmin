package com.latte;

import lombok.Getter;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 전역적인 설정을 제공하는 클래스
@Getter
@ControllerAdvice
class GlobalControllerAdvice {

    // 각 컨트롤러 메서드가 실행되기 전에 호출
//    @ModelAttribute
//    public void addAttribute(Model model, @AuthenticationPrincipal CustomUserDetails customUserDetails) {
//        // 시큐리티 인증 객체가 있다면
//        if (customUserDetails != null) {
//            model.addAttribute("user", customUserDetails);
//        }
//    }

    @ModelAttribute
    public void addAttribute(Model model) {
        model.addAttribute("specialHallList", getSpecialHallList());
        model.addAttribute("localList", getLocalList());
        model.addAttribute("seoulList", getSeoulList());
        model.addAttribute("gyeonggiIncheonList", getGyeonggiIncheonList());
        model.addAttribute("chungCheongDaeJeonList", getChungCheongDaeJeonList());
        model.addAttribute("jeollaGwangjuList", getJeollaGwangjuList());
        model.addAttribute("gyeongbukDaeguList", getGyeongbukDaeguList());
        model.addAttribute("gyeongnamBusanUlsanList", getGyeongnamBusanUlsanList());
        model.addAttribute("gangwonList", getGangwonList());
        model.addAttribute("jejuList", getJejuList());
        model.addAttribute("sizeList", getSizeList());
        model.addAttribute("mobileCarrierList", getMobileCarrierList());
    }

    // 글로벌 멤버 변수
    private final List<String> specialHallList = new ArrayList<>(Arrays.asList("홈", "샤라떼", "수퍼플렉스", "수퍼MX4D", "수퍼 4D",
            "수퍼 S", "수퍼LED", "씨네컴포트(리클라이너)", "씨네패밀리", "씨네커플", "씨네비즈"));

    private final List<String> localList = new ArrayList<>(
            Arrays.asList("서울", "경기/인천", "충청/대전", "전라/광주", "경북/대구", "경남/부산/울산", "강원", "제주"));

    private final List<String> seoulList = new ArrayList<>(
            Arrays.asList("가산디지털", "가양", "강동", "건대입구", "김포공항", "노원", "도곡", "독산", "서울대입구", "수락산", "수유", "신대방(구로디지털역)",
                    "신도림", "신림", "에비뉴엘(명동)", "영등포", "용산", "월드타워", "은평(롯데몰)", "중랑", "청량리", "합정", "홍대입구"));

    private final List<String> gyeonggiIncheonList = new ArrayList<>(Arrays.asList("광교(아울렛)", "광명(광명사거리)", "광명아울렛",
            "광주터미널", "구리아울렛", "동탄", "라페스타", "마석", "별내", "병점", "부천(신중동역)", "부천역", "부평", "부평갈산", "부평역사", "북수원(천천동)",
            "산본피트인", "서수원", "성남중앙(신흥역)", "센트럴락", "송탄", "수원(수원역)", "수지", "시화(정왕역)", "시흥장현", "안산", "안산고잔", "안성",
            "안양(안양역)", "안양일번가", "영종하늘도시", "오산원동", "용인기흥", "용인역북", "위례", "의정부민락", "인덕원", "인천아시아드", "인천터미널", "주엽", "진접",
            "파주롯데아울렛", "파주운정", "판교(창조경제밸리)", "평촌(범계역)", "하남미사", "향남"));

    private final List<String> chungCheongDaeJeonList = new ArrayList<>(Arrays.asList("당진", "대전(백화점)", "대전관저", "대전센트럴",
            "서산", "서청주(아울렛)", "아산터미널", "천안불당", "천안청당", "천주용암", "충주(모다아울렛)"));

    private final List<String> jeollaGwangjuList = new ArrayList<>(
            Arrays.asList("광주(백화점)", "광주광산", "군산나운", "군산몰", "수완(아울렛)", "익산모현", "전주(백화점)", "전주송천", "전주평화", "충장로"));

    private final List<String> gyeongbukDaeguList = new ArrayList<>(Arrays.asList("경주", "경주황성", "구미공단", "대구광장", "대구율하",
            "대구현풍", "동성로", "상인", "상주", "성서", "영주", "영천", "포항", "프리미엄구미센트럴", "프리미엄안동", "프리미엄칠곡"));

    private final List<String> gyeongnamBusanUlsanList = new ArrayList<>(Arrays.asList("거창", "광복", "김해부원", "김해아울렛(장유)",
            "동래", "동부산아울렛", "마산(합성동)", "부산명지", "부산본점", "부산장림", "사천", "서면(전포동)", "센텀시티", "양산물금", "엠비씨네(진주)", "오투(부산대)",
            "울산(백화점)", "울산성남", "진주혁신(롯데몰)", "진해", "창원", "통영", "프리미엄경남대", "프리미엄해운대(장산역)"));

    private final List<String> gangwonList = new ArrayList<>(Arrays.asList("남원주", "동해", "원주무실", "춘천"));

    private final List<String> jejuList = new ArrayList<>(Arrays.asList("서귀포", "제주연동"));

    private final List<Integer> sizeList = new ArrayList<>(Arrays.asList(seoulList.size(), gyeonggiIncheonList.size(),
            chungCheongDaeJeonList.size(), jeollaGwangjuList.size(), gyeongbukDaeguList.size(),
            gyeongnamBusanUlsanList.size(), gangwonList.size(), jejuList.size()));

    private final List<String> mobileCarrierList = new ArrayList<>(Arrays.asList("LGU+", "SKT", "KT"));

    // 날짜 정보 month를 2자리로 맞추기 위한 메서드
    private final String getMonth(int month) {
        if (month < 10) {
            return "0" + String.valueOf(month);
        } else {
            return String.valueOf(month);
        }
    }

    // 날짜 정보 day를 2자리로 맞추기 위한 메서드
    private final String getDay(int day) {
        if (day < 10) {
            return "0" + String.valueOf(day);
        } else {
            return String.valueOf(day);
        }
    }
}
