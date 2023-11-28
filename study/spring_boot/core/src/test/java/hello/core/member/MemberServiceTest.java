package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService service;

    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        service = appConfig.memberService();
    }

    @Test
    void join(){
        //given
        Member m= new Member(1L, "memberA", Grade.VIP);

        //when
        service.join(m);
        Member fm = service.findMember(1L);

        //then
        Assertions.assertThat(m).isEqualTo(fm);
    }
}
