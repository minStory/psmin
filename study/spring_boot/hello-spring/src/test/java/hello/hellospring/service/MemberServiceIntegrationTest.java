package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {

    @Autowired MemberService service;
    @Autowired MemberRepository repository;

    @Test
    void 회원가입() {
        //given(무언가 주어졌을 때)
        Member m = new Member();
        m.setName("spring");

        //when(그것을 실행했을 때)
        Long saveId = service.join(m);

        //then(결과가 이렇게 나와야 한다)
        Member findMember = service.findOne(saveId).get();
        Assertions.assertThat(m.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void 중복_회원_예외(){
        //given
        Member m1 = new Member();
        m1.setName("spring");

        Member m2 = new Member();
        m2.setName("spring");

        //when
        service.join(m1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> service.join(m2));

        //then
        Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

    }
}