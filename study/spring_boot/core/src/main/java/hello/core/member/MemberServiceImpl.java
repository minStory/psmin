package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;

    @Autowired
    public MemberServiceImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public void join(Member m) {
        repository.save(m);
    }

    @Override
    public Member findMember(Long mId) {
        return repository.findById(mId);
    }

    //싱글톤 객체 확인 용도
    public MemberRepository getRepository() {
        return repository;
    }
}
