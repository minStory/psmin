package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService service;
    MemoryMemberRepository repository;

//    Test 시작할 때마다 실행할 함수
//    테스트가 서로 영향이 없도록 항상 새로운 객체를 생성하고, 의존관계도 새로 맺어준다.
    @BeforeEach
    void beforeEach(){
        repository = new MemoryMemberRepository();
        service = new MemberService(repository);
        repository.clearStore();
    }
    //    Test 끝날 때마다 실행할 함수
//    @AfterEach
//    void afterEach(){
//        repository.clearStore();
//    }

//    Test 멤버는 한글로 작성해도 무방하다.
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

//        try{
//            memberService.join(m2);
//            fail();
//        }catch(IllegalStateException e){
//            Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//        }

        //then
        Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

    }

//    @Test
//    void findMembers() {
//    }
//
//    @Test
//    void findOne() {
//    }
}