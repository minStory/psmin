package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService service = appConfig.memberService();
//        MemberService service = new MemberServiceImpl();
        Member m = new Member(1L, "memberA", Grade.VIP);
        service.join(m);

        Member findMember = service.findMember(1L);
        System.out.println("new member = "+m.getName());
        System.out.println("find Member = " + findMember.getName());
        System.out.println(m.getName() == findMember.getName());
    }
}
