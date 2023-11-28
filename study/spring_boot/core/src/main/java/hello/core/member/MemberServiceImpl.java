package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;

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
}
