package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions.*;
import org.assertj.core.api.ObjectAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

//    Test를 먼저 개발하는 TDD 방식도 존재한다.
//    Test는 순서와 의존 관계가 없어야 하므로 한 싸이클 돌 때마다 저장소 비워줘서 충돌을 없애준다.
    @AfterEach
    void afterEach(){
        repository.clearStore();
    }

    @Test
    void save(){
        Member m = new Member();
        m.setName("spring");

        repository.save(m);

        Member result = repository.findById(m.getId()).get();
//        일일이 출력하여 검사 방식
//        System.out.println("result = "+(member == result));
//        Junit Library 검사 방식
//        Assertions.assertEquals(result,member);
//        assert Library 검사 방식 ✅
        assertThat(m).isEqualTo(result);
    }
    @Test
    void findByName(){
        Member m1 = new Member();
        m1.setName("spring1");
        repository.save(m1);

        Member m2 = new Member();
        m2.setName("spring2");
        repository.save(m2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(m1);
    }
    @Test
    void findAll(){
        Member m1 = new Member();
        m1.setName("spring1");
        repository.save(m1);

        Member m2 = new Member();
        m2.setName("spring1");
        repository.save(m2);

        int result = repository.findAll().size();

        assertThat(repository.findAll().size()).isEqualTo(result);
    }
}
