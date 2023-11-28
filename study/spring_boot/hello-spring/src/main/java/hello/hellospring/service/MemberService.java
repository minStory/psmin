package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.List;
import java.util.Optional;

//@Service
@Transactional
public class MemberService {

    private final MemberRepository repository;

//    DI(의존성주입) : 외부에서 값을 넣어준다.
//    MemberService class와 MemberServiceTest class의 repository를 공유시킨다.
//    @Autowired
    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    //    회원가입
    public Long join(Member m){
        //AOP 직접 등록
//        long start = System.currentTimeMillis();
//        try{
            validateDuplicateMember(m); //중복 회원 검증
            repository.save(m);
            return m.getId();
//        }finally{
//            long finish = System.currentTimeMillis();
//            long timeMs = finish - start;
//            System.out.println("join = "+timeMs+"ms");
//        }

    }
//    리팩토링 -> 메서드화
    private void validateDuplicateMember(Member m) {
//        어차피 반환 값이 Optional<Member>이기 때문에 변수 생성을 생략하고 바로 메서드를 사용할 수 있다.
        repository.findByName(m.getName())
                .ifPresent(m_ -> {
                   throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }
//    전체 회원 조회
    public List<Member> findMembers(){
        //AOP 직접 등록
//        long start = System.currentTimeMillis();
//        try{
            return repository.findAll();
//        }finally{
//            long finish = System.currentTimeMillis();
//            long timeMs = finish - start;
//            System.out.println("findMembers = "+timeMs+"ms");
//        }
    }
    
//    ID 입력해서 회원 조회
    public Optional<Member> findOne(Long memberId){
        return repository.findById(memberId);
    }
}
