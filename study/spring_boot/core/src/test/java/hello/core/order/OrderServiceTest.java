package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder(){
        Long mId = 1L;
        Member m = new Member(mId,"memberA", Grade.VIP);
        memberService.join(m);

        Order order = orderService.createOrder(mId,"itemA",10000);
        Assertions.assertThat(order.calculatePrice()).isEqualTo(9000);
    }

}