package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.order.Order;
import hello.core.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
//        MemberService memberService = new MemberServiceImpl(null);
//        OrderService orderService = new OrderServiceImpl(null,null);

        Long mId = 1L;
        Member m = new Member(mId, "memberA", Grade.VIP);
        memberService.join(m);

        Order order = orderService.createOrder(mId, "itemA", 20000);
        
        System.out.println("order = "+order);
        System.out.println("order.getItemPrice() = " + order.getItemPrice());
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
