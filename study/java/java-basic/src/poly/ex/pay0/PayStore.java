package poly.ex.pay0;

public class PayStore {
    
    //변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KaKaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("toss")) {
            return new TossPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
